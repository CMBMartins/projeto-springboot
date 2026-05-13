package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;

@RestController
@RequestMapping("/planilha")
@CrossOrigin(origins = "*")
public class PlanilhaEletricaController {

    @Autowired
    private PlanilhaEletricaRepository repository;

    // Método para Salvar
    @PostMapping
    public PlanilhaEletrica salvar(@RequestBody PlanilhaEletrica novo) {

        double pt = novo.getPotenciatotal();
        String tipo = novo.getTipocircuito();

        // Define tensão conforme tipo do circuito
        double tensao = 127.0; // padrão iluminação / tomada

        if ("Motor".equalsIgnoreCase(tipo)) {
            tensao = 220.0;

        } else if ("Bifasico".equalsIgnoreCase(tipo)) {
            tensao = 220.0;

        } else if ("Trifasico".equalsIgnoreCase(tipo)) {
            tensao = 380.0;

        } else if ("Tomada".equalsIgnoreCase(tipo)) {
            tensao = 127.0;

        } else if ("Iluminacao".equalsIgnoreCase(tipo)) {
            tensao = 127.0;
        }

        // Cálculos
        double pc = pt * 0.66;
        double ic = pc / tensao;
        double ib = ic * 1.42;

        novo.setPotenciacorrigida(arred(pc));
        novo.setCorrenteic(arred(ic));
        novo.setCorrenteib(arred(ib));

        // TOMADA
        if ("Tomada".equalsIgnoreCase(tipo)) {

            if (ib <= 20) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("20A");

            } else if (ib <= 28) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("25A");

            } else {
                novo.setCondutor("6 mm²");
                novo.setDisjuntor("32A");
            }
        }

        // MOTOR
        else if ("Motor".equalsIgnoreCase(tipo)) {

            if (ib <= 10) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("10A");

            } else if (ib <= 20) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("20A");

            } else {
                novo.setCondutor("6 mm²");
                novo.setDisjuntor("32A");
            }
        }

        // CIRCUITOS BIFASICOS
        else if ("Bifasico".equalsIgnoreCase(tipo)) {

            if (ib <= 60) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("65A");

            } else if (ib <= 70) {
                novo.setCondutor("25 mm²");
                novo.setDisjuntor("70A");

            } else {
                novo.setCondutor("35 mm²");
                novo.setDisjuntor("90A");
            }
        }

        // CIRCUITOS TRIFASICOS
        else if ("Trifasico".equalsIgnoreCase(tipo)) {

            if (ib <= 60) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("65A");

            } else if (ib <= 70) {
                novo.setCondutor("25 mm²");
                novo.setDisjuntor("70A");

            } else {
                novo.setCondutor("35 mm²");
                novo.setDisjuntor("90A");
            }
        }

        // ILUMINAÇÃO
        else if ("Iluminacao".equalsIgnoreCase(tipo)
                || "Iluminação".equalsIgnoreCase(tipo)) {

            novo.setCondutor("1,5 mm²");
            novo.setDisjuntor("16A");
        }

        else {
            novo.setCondutor("4 mm2");
            novo.setDisjuntor("20A");
        }

        return repository.save(novo);
    }

    // Método Editar
    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@PathVariable Long id,
            @RequestBody PlanilhaEletrica dados) {

        return repository.findById(id)
                .map(registro -> {

                    registro.setProjeto(dados.getProjeto());
                    registro.setCircuito(dados.getCircuito());
                    registro.setDescricao(dados.getDescricao());
                    registro.setPotenciatotal(dados.getPotenciatotal());
                    registro.setPotenciacorrigida(dados.getPotenciacorrigida());
                    registro.setTipocircuito(dados.getTipocircuito());
                    registro.setCorrenteic(dados.getCorrenteic());
                    registro.setCorrenteib(dados.getCorrenteib());
                    registro.setDisjuntor(dados.getDisjuntor());
                    registro.setCondutor(dados.getCondutor());
                    registro.setUsuario(dados.getUsuario());

                    repository.save(registro);

                    return ResponseEntity.ok("Atualizado com sucesso");

                }).orElse(ResponseEntity.notFound().build());
    }

    // Método Excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {

        return repository.findById(id)
                .map(registro -> {

                    repository.delete(registro);

                    return ResponseEntity.ok("Registro excluído com sucesso");

                }).orElse(ResponseEntity.notFound().build());
    }

    // METODO ALTERAR TIPO DE CIRCUITO
    @PutMapping("/{id}/tipocircuito")
    public ResponseEntity<?> editarTipoCircuito(
            @PathVariable Long id,
            @RequestBody Map<String, String> dados) {

        return repository.findById(id)
                .map(registro -> {

                    String novoTipo = dados.get("tipocircuito");

                    registro.setTipocircuito(novoTipo);

                    repository.save(registro);

                    return ResponseEntity.ok("Tipo atualizado com sucesso");

                }).orElse(ResponseEntity.notFound().build());
    }

    // Método Listar Todos
    @GetMapping
    public List<PlanilhaEletrica> listar() {
        return repository.findAll();
    }

    // Método Buscar por Projeto
    @GetMapping("/buscar")
    public List<PlanilhaEletrica> buscarPorProjeto(@RequestParam String projeto) {
        return repository.findByProjetoContainingIgnoreCase(projeto);
    }

    @GetMapping("/usuario")
    public List<PlanilhaEletrica> listarPorUsuario(@RequestParam String usuario) {
        return repository.findByUsuario(usuario);
    }

    private double arred(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}