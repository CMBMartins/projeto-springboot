package com.SpringBoot.projetosspringboot;

import java.time.LocalDateTime;

public class CameraDTO {

    private String compartimento;
    private LocalDateTime dataHora;

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}