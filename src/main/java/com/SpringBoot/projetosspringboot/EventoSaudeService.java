package com.SpringBoot.projetosspringboot;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Service
public class EventoSaudeService {

    @Autowired
    private SaudeRepository repository;

    private final List<SseEmitter> clientes = new CopyOnWriteArrayList<>();

    private LocalDateTime ultimaComunicacaoCamera;

    public SseEmitter conectar() {

        SseEmitter emitter = new SseEmitter(0L);

        clientes.add(emitter);

        emitter.onCompletion(() -> clientes.remove(emitter));
        emitter.onTimeout(() -> clientes.remove(emitter));
        emitter.onError((e) -> clientes.remove(emitter));

        return emitter;
    }

    public void notificarAtualizacao() {

        for (SseEmitter emitter : clientes) {

            try {

                emitter.send(
                        SseEmitter.event()
                                .name("atualizacao")
                                .data("atualizado"));

            } catch (IOException e) {

                emitter.complete();

                clientes.remove(emitter);

            }

        }
    }

    public void atualizarMedicamentosAtrasados(String usuario) {

        LocalTime agora = LocalTime.now(
                java.time.ZoneId.of("America/Belem"));

        List<Saude> medicamentos = repository.findByUsuario(usuario);

        boolean alterou = false;

        for (Saude medicamento : medicamentos) {

            if (Boolean.FALSE.equals(medicamento.getConsumido())
                    && medicamento.getHorarioPrevisto() != null
                    && medicamento.getHorarioPrevisto().isBefore(agora)
                    && !Boolean.TRUE.equals(medicamento.getAtrasado())) {

                medicamento.setAtrasado(true);
                alterou = true;
            }
        }

        if (alterou) {

            repository.saveAll(medicamentos);

            notificarAtualizacao();

            System.out.println("Medicamentos atrasados atualizados para " + usuario);
        }
    }

    public void atualizarComunicacaoCamera() {

        ultimaComunicacaoCamera = LocalDateTime.now(
                ZoneId.of("America/Belem"));

        System.out.println(
                "📷 Última comunicação da câmera: "
                        + ultimaComunicacaoCamera);

        notificarAtualizacao();
    }

    public String verificarStatusCamera() {

        if (ultimaComunicacaoCamera == null) {
            return "OFFLINE";
        }

        LocalDateTime agora = LocalDateTime.now(
                ZoneId.of("America/Belem"));

        long segundos = java.time.Duration.between(
                ultimaComunicacaoCamera,
                agora).getSeconds();

        if (segundos <= 20) {
            return "ONLINE";
        }

        return "OFFLINE";
    }

}