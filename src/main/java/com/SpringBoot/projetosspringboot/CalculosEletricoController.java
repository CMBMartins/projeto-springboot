package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;

@RestController
@RequestMapping("/calculoseletrico")
@CrossOrigin(origins = "*")
public class CalculosEletricoController {

    @Autowired
    private CalculosEletricoRepository repository;

    // Método para salvar na tabela calculoseletrico
    @PostMapping
    public CalculosEletrico salvar(@RequestBody CalculosEletrico novo) {

        // Validações básicas
        if (novo.getProjeto() == null || novo.getProjeto().trim().isEmpty()) {
            throw new RuntimeException("O campo projeto é obrigatório.");
        }

        if (novo.getAmbiente() == null || novo.getAmbiente().trim().isEmpty()) {
            throw new RuntimeException("O campo ambiente é obrigatório.");
        }

        if (novo.getDescricao() == null || novo.getDescricao().trim().isEmpty()) {
            throw new RuntimeException("O campo descrição é obrigatório.");
        }

        if (novo.getUsuario() == null || novo.getUsuario().trim().isEmpty()) {
            throw new RuntimeException("O campo usuário é obrigatório.");
        }

        // Se ID vier preenchido, zera para garantir INSERT
        novo.setId(null);

        // Salva no banco
        return repository.save(novo);
    }

    // Método Editar
    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@PathVariable Long id,
            @RequestBody CalculosEletrico dados) {

        return repository.findById(id)
                .map(registro -> {

                    registro.setProjeto(dados.getProjeto());
                    registro.setAmbiente(dados.getAmbiente());
                    registro.setDescricao(dados.getDescricao());
                    registro.setPotenciadeluz(dados.getPotenciadeluz());
                    registro.setTomadasdeusogeral(dados.getTomadasdeusogeral());
                    registro.setTomadasdeusoespecifico(dados.getTomadasdeusoespecifico());
                    registro.setTipodocircuito(dados.getTipodocircuito());
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

    // MÉTODO ALTERAR TIPO DE CIRCUITO
    @PutMapping("/{id}/tipodocircuito")
    public ResponseEntity<?> editarTipodoCircuito(
            @PathVariable Long id,
            @RequestBody Map<String, String> dados) {

        try {

            return repository.findById(id)
                    .map(registro -> {

                        String novoTipo = dados.get("tipodocircuito");

                        // Validação
                        if (novoTipo == null || novoTipo.trim().isEmpty()) {
                            return ResponseEntity.badRequest()
                                    .body("O campo tipodocircuito é obrigatório.");
                        }

                        // Remove espaços extras
                        novoTipo = novoTipo.trim();

                        // Atualiza campo
                        registro.setTipodocircuito(novoTipo);

                        // Salva alteração
                        repository.save(registro);

                        return ResponseEntity.ok("Tipo de circuito atualizado com sucesso.");

                    }).orElse(ResponseEntity.status(404)
                            .body("Registro não encontrado."));

        } catch (Exception e) {

            return ResponseEntity.status(500)
                    .body("Erro ao atualizar tipo de circuito: " + e.getMessage());
        }
    }

    // Método Listar Todos
    @GetMapping
    public List<CalculosEletrico> listar() {
        return repository.findAll();
    }

    // Método Buscar por Projeto
    @GetMapping("/buscar")
    public List<CalculosEletrico> buscarPorProjeto(@RequestParam String projeto) {
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