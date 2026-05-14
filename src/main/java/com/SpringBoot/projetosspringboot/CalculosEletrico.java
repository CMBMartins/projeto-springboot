package com.SpringBoot.projetosspringboot;

import jakarta.persistence.*;

@Entity
@Table(name = "calculoseletrico")

public class CalculosEletrico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projeto;
    private String ambiente;
    private String descricao;
    private Double potenciadeluz;
    private Double tomadasdeusogeral;
    private String tomadasdeusoespecifico;
    private String tipodocircuito;
    private String usuario;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPotenciadeluz() {
        return potenciadeluz;
    }

    public void setPotenciadeluz(Double potenciadeluz) {
        this.potenciadeluz = potenciadeluz;
    }

    public Double getTomadasdeusogeral() {
        return tomadasdeusogeral;
    }

    public void setTomadasdeusogeral(Double tomadasdeusogeral) {
        this.tomadasdeusogeral = tomadasdeusogeral;
    }

    public String getTomadasdeusoespecifico() {
        return tomadasdeusoespecifico;
    }

    public void setTomadasdeusoespecifico(String tomadasdeusoespecifico) {
        this.tomadasdeusoespecifico = tomadasdeusoespecifico;
    }

    public String getTipodocircuito() {
        return tipodocircuito;
    }

    public void setTipodocircuito(String tipodocircuito) {
        this.tipodocircuito = tipodocircuito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}