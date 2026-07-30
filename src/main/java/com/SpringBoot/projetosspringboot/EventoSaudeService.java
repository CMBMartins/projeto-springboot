package com.SpringBoot.projetosspringboot;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Service
public class EventoSaudeService {

    private final List<SseEmitter> clientes = new CopyOnWriteArrayList<>();

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

}