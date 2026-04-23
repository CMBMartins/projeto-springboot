package com.SpringBoot.projetosspringboot;

import jakarta.persistence.*;

@Entity
@Table(name = "bancoprojetos")

public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String cliente;
    private String tamanhodoimovel;
    private String valordoprojeto;
    private String datadaentrega;
    private String tipo;
    private String genero;
    private String usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return id;
    }

    public void setCodigo(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTamanhodoimovel() {
        return tamanhodoimovel;
    }

    public void setTamanhodoimovel(String tamanhodoimovel) {
        this.tamanhodoimovel = tamanhodoimovel;
    }

    public String getValordoprojeto() {
        return valordoprojeto;
    }

    public void setValordoprojeto(String valordoprojeto) {
        this.valordoprojeto = valordoprojeto;
    }

    public String getDatadaentrega() {
        return datadaentrega;
    }

    public void setDatadaentrega(String datadaentrega) {
        this.datadaentrega = datadaentrega;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}