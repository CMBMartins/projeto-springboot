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

        if ("Circuitoespecifico".equalsIgnoreCase(tipo)) {
            tensao = 220.0;

        } else if ("Tomada".equalsIgnoreCase(tipo)) {
            tensao = 127.0;

        } else if ("Monofasico".equalsIgnoreCase(tipo)) {
            tensao = 127.0;

        } else if ("Bifasico".equalsIgnoreCase(tipo)) {
            tensao = 220.0;

        } else if ("Trifasico".equalsIgnoreCase(tipo)) {
            tensao = 380.0;

        } else if ("Iluminacao".equalsIgnoreCase(tipo)) {
            tensao = 127.0;
        }

        
        // Cálculos elétricos conforme o tipo de circuito
        double pc;
        double ib;
        double ic;

        if ("Alimentadorgeral".equalsIgnoreCase(tipo)) {

            // Cálculo do alimentador
            double raiz3 = 1.732;
            double fp = 0.95;

            double pCalculada = pt / fp;
            pc = pCalculada * 0.66;
            ib = pc / (raiz3 * tensao);
            ic = ib * 1.10;

        } else if ("Circuitoespecifico".equalsIgnoreCase(tipo)) {

            // Circuito específico: considera a potência total
            pc = pt;
            ib = pc / tensao;
            ic = ib * 1.10;

        } else {

            // Demais circuitos: aplica o fator de correção de 0,66
            pc = pt * 0.66;
            ib = pc / tensao;
            ic = ib * 1.10;
        }

        novo.setPotenciacorrigida(arred(pc));
        novo.setCorrenteib(arred(ib));
        novo.setCorrenteic(arred(ic));


        // TOMADA
        if ("Tomada".equalsIgnoreCase(tipo)) {

            if (ic <= 10) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("10A");

            } else if (ic <= 16) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("16A");

            } else if (ic <= 20) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("20A");

            } else if (ic <= 30) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("25A");

            } else {
                novo.setCondutor("6 mm²");
                novo.setDisjuntor("40A");
            }
        }

        // CIRCUITO ESPECIFICO
        else if ("Circuitoespecifico".equalsIgnoreCase(tipo)) {

            if (ic <= 10) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("10A");

            } else if (ic <= 16) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("16A");

            } else if (ic <= 20) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("20A");

            } else if (ic <= 30) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("30A");

            } else if (ic <= 35) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("35A");

            } else if (ic <= 40) {
                novo.setCondutor("6 mm²");
                novo.setDisjuntor("40A");

            } else {
                novo.setCondutor("10 mm²");
                novo.setDisjuntor("50A");
            }
        }

        // ALIMENTADOR GERAL
        else if ("Alimentadorgeral".equalsIgnoreCase(tipo)) {

            if (ic <= 50) {
                novo.setCondutor("10 mm²");
                novo.setDisjuntor("50A");

            } else if (ic <= 60) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("60A");

            } else if (ic <= 73) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("75A");

            } else if (ic <= 80) {
                novo.setCondutor("25 mm²");
                novo.setDisjuntor("80A");

            } else {
                novo.setCondutor("35 mm²");
                novo.setDisjuntor("90A");
            }
        }

        // CIRCUITOS MONOFASICOS
        else if ("Monofasico".equalsIgnoreCase(tipo)) {

            if (ic <= 10) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("10A");

            } else if (ic <= 16) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("16A");

            } else if (ic <= 20) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("20A");

            } else {
                novo.setCondutor("4,0 mm²");
                novo.setDisjuntor("30A");
            }
        }

        // CIRCUITOS BIFASICOS
        else if ("Bifasico".equalsIgnoreCase(tipo)) {

            if (ic <= 50) {
                novo.setCondutor("10 mm²");
                novo.setDisjuntor("50A");

            } else if (ic <= 60) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("60A");

            } else if (ic <= 73) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("75A");

            } else if (ic <= 80) {
                novo.setCondutor("25 mm²");
                novo.setDisjuntor("80A");

            } else {
                novo.setCondutor("35 mm²");
                novo.setDisjuntor("90A");
            }
        }

        // CIRCUITOS TRIFASICOS
        else if ("Trifasico".equalsIgnoreCase(tipo)) {

            if (ic <= 70) {
                novo.setCondutor("16 mm²");
                novo.setDisjuntor("70A");

            } else if (ic <= 90) {
                novo.setCondutor("25 mm²");
                novo.setDisjuntor("90A");

            } else {
                novo.setCondutor("35 mm²");
                novo.setDisjuntor("100A");
            }
        }

        // ILUMINAÇÃO
        else if ("Iluminacao".equalsIgnoreCase(tipo)
                || "Iluminação".equalsIgnoreCase(tipo)) {

            novo.setCondutor("1,5 mm²");
            novo.setDisjuntor("16A");
        }

        else {
            novo.setCondutor("2,5 mm2");
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