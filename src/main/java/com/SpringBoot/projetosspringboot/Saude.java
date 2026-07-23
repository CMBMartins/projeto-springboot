package com.SpringBoot.projetosspringboot;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "bancosaude")

public class Saude {

    @NotBlank(message = "O medicamento é obrigatório.")
    @Column(nullable = false)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medicamento;
    private String compartimento;
    private LocalTime horarioPrevisto;
    private LocalTime horarioConsumido;
    private Boolean consumido;
    private Boolean atrasado;
    private Boolean compartimentoVazio;
    private String statusSensor;
    private LocalDateTime ultimaLeituraCamera;
    private String usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public LocalTime getHorarioPrevisto() {
        return horarioPrevisto;
    }

    public void setHorarioPrevisto(LocalTime horarioPrevisto) {
        this.horarioPrevisto = horarioPrevisto;
    }

    public LocalTime getHorarioConsumido() {
        return horarioConsumido;
    }

    public void setHorarioConsumido(LocalTime horarioConsumido) {
        this.horarioConsumido = horarioConsumido;
    }

    public Boolean getConsumido() {
        return consumido;
    }

    public void setConsumido(Boolean consumido) {
        this.consumido = consumido;
    }

    public Boolean getAtrasado() {
        return atrasado;
    }

    public void setAtrasado(Boolean atrasado) {
        this.atrasado = atrasado;
    }

    public Boolean getCompartimentoVazio() {
        return compartimentoVazio;
    }

    public void setCompartimentoVazio(Boolean compartimentoVazio) {
        this.compartimentoVazio = compartimentoVazio;
    }

    public String getStatusSensor() {
        return statusSensor;
    }

    public void setStatusSensor(String statusSensor) {
        this.statusSensor = statusSensor;
    }

    public LocalDateTime getUltimaLeituraCamera() {
        return ultimaLeituraCamera;
    }

    public void setUltimaLeituraCamera(LocalDateTime ultimaLeituraCamera) {
        this.ultimaLeituraCamera = ultimaLeituraCamera;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}