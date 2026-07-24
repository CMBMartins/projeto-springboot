package com.SpringBoot.projetosspringboot;

public class DashboardSaudeDTO {

    private Saude proximoMedicamento;
    private Saude ultimoConsumido;

    private Long consumidosHoje;
    private Long pendentes;
    private Long atrasados;

    private Long compartimentosVazios;
    private Long compartimentosOcupados;

    private Double adesao;

    private String statusSensor;

    // ===========================
    // Getters e Setters
    // ===========================

    public Saude getProximoMedicamento() {
        return proximoMedicamento;
    }

    public void setProximoMedicamento(Saude proximoMedicamento) {
        this.proximoMedicamento = proximoMedicamento;
    }

    public Saude getUltimoConsumido() {
        return ultimoConsumido;
    }

    public void setUltimoConsumido(Saude ultimoConsumido) {
        this.ultimoConsumido = ultimoConsumido;
    }

    public Long getConsumidosHoje() {
        return consumidosHoje;
    }

    public void setConsumidosHoje(Long consumidosHoje) {
        this.consumidosHoje = consumidosHoje;
    }

    public Long getPendentes() {
        return pendentes;
    }

    public void setPendentes(Long pendentes) {
        this.pendentes = pendentes;
    }

    public Long getAtrasados() {
        return atrasados;
    }

    public void setAtrasados(Long atrasados) {
        this.atrasados = atrasados;
    }

    public Long getCompartimentosVazios() {
        return compartimentosVazios;
    }

    public void setCompartimentosVazios(Long compartimentosVazios) {
        this.compartimentosVazios = compartimentosVazios;
    }

    public Long getCompartimentosOcupados() {
        return compartimentosOcupados;
    }

    public void setCompartimentosOcupados(Long compartimentosOcupados) {
        this.compartimentosOcupados = compartimentosOcupados;
    }

    public Double getAdesao() {
        return adesao;
    }

    public void setAdesao(Double adesao) {
        this.adesao = adesao;
    }

    public String getStatusSensor() {
        return statusSensor;
    }

    public void setStatusSensor(String statusSensor) {
        this.statusSensor = statusSensor;
    }

    public class StatusSaudeDTO {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

}