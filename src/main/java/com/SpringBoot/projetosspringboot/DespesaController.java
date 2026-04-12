package com.SpringBoot.projetosspringboot;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/despesas")
@CrossOrigin(origins = "*")
public class DespesaController {

        @Autowired
        private DespesaRepository repository;   

        @PostMapping
        public Despesa salvar(@RequestBody Despesa despesa) {
                return repository.save(despesa);
        }

        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Integer id) {
                repository.deleteById(id);
        }        

        @PutMapping("/{id}")
        public Despesa editar(@PathVariable Integer id, @RequestBody Despesa nova) {

                Despesa existente = repository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Despesa não encontrada"));

                existente.setDescricao(nova.getDescricao());
                existente.setCategoria(nova.getCategoria());
                existente.setValor(nova.getValor());
                existente.setStatus(nova.getStatus());
                existente.setData(nova.getData());

                return repository.save(existente);
        }

        @GetMapping("/buscar")
        public List<Despesa> buscar(
                        @RequestParam String usuario,
                        @RequestParam String descricao) {

                return repository
                                .findByUsuarioAndDescricaoContainingIgnoreCase(usuario, descricao);
        }

        // 💰 RENDA     
    @GetMapping("/renda")
    public Double totalEntradas(@RequestParam String usuario) {
    return repository.findByUsuario(usuario)
    //return repository.findAll()
            .stream()
            .filter(d -> d.getStatus() != null &&                   
                   (d.getStatus().equalsIgnoreCase("RECEBIDO")))
            .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
            .sum();
    }
   
        @GetMapping
        public List<Despesa> listar() {
                return repository.findAll();
        }

        @GetMapping("/usuario")
        public List<Despesa> listarPorUsuario(@RequestParam String usuario) {
                return repository.findByUsuario(usuario);
        }

        // ÚLTIMAS 5
        @GetMapping("/ultimas")
        public List<Despesa> ultimas() {
                return repository.findTop5ByOrderByDataDesc();
        }

    @GetMapping("/total")
    public Double total(@RequestParam String usuario) {

    Double total = repository.somarTotal(usuario);

    return total != null ? total : 0.0;
}

        // TOTAL DE RENDAS
        @GetMapping("/renda-total")
        public Double totalEntradas(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .filter(d -> d.getStatus() != null &&
                                                (d.getStatus().equalsIgnoreCase("RECEBIDO")))
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();
        }

    @GetMapping("/saldo")
    public Double saldo(@RequestParam String usuario) {

    Double total = repository.calcularSaldo(usuario);

    return total != null ? total : 0.0;
    }

        // GRAFICO POR CATEGORIA
        @GetMapping("/categoria")
        public Map<String, Double> porCategoria(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .collect(Collectors.groupingBy(
                                                d -> d.getCategoria() != null ? d.getCategoria() : "Outros",
                                                Collectors.summingDouble(
                                                                d -> d.getValor() != null ? d.getValor() : 0.0)));
        }

        // STATUS
        @GetMapping("/status")
        public Map<String, Long> status(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .collect(Collectors.groupingBy(
                                                d -> d.getStatus() != null ? d.getStatus().toUpperCase() : "OUTRO",
                                                Collectors.counting()));
        }

        // DESPESAS POR MÊS
        @GetMapping("/mensal")
        public Map<Integer, Double> despesasPorMes(@RequestParam String usuario) {

                return repository.findByUsuario(usuario)
                                .stream()
                                .filter(d -> d.getData() != null)

                                .collect(Collectors.groupingBy(
                                                d -> d.getData().getMonthValue(), // 🔥 1 a 12

                                                Collectors.summingDouble(d -> {

                                                        if (d.getValor() == null)
                                                                return 0.0;
                                                        if (d.getTipo() == null)
                                                                return 0.0;

                                                        if (d.getTipo().equalsIgnoreCase("entrada")) {
                                                                return d.getValor(); // soma
                                                        }

                                                        if (d.getTipo().equalsIgnoreCase("saida")) {
                                                                return -d.getValor(); // subtrai
                                                        }

                                                        return 0.0;
                                                })));
        }

    // VALOR DE DESPESAS POR MÊS
    @GetMapping("/mes")
    public Double mes(@RequestParam String usuario) {

    Double total = repository.somarMes(usuario);

    return total != null ? total : 0.0;
}

        // COMPARATIVO DE DESPESAS MENSAIS
        @GetMapping("/comparativo-mensal")
        public Map<String, Double> comparativoMensal(@RequestParam String usuario) {
                // return repository.findByUsuario(usuario)
                LocalDate hoje = LocalDate.now();
                LocalDate mesAnterior = hoje.minusMonths(1);

                double atual = repository.findByUsuario(usuario)
                                .stream()
                                .filter(d -> d.getData() != null &&
                                                d.getData().getMonthValue() == hoje.getMonthValue() &&
                                                d.getData().getYear() == hoje.getYear())
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                double anterior = repository.findAll()
                                .stream()
                                .filter(d -> d.getData() != null &&
                                                d.getData().getMonthValue() == mesAnterior.getMonthValue() &&
                                                d.getData().getYear() == mesAnterior.getYear())
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                Map<String, Double> result = new HashMap<>();
                result.put("atual", atual);
                result.put("anterior", anterior);

                return result;
        }
}
