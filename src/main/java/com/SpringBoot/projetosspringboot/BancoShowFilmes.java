package com.SpringBoot.projetosspringboot;

import jakarta.persistence.*;

@Entity
@Table(name = "bancoshowsfilmes")
public class BancoShowFilmes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String artista;
    private String anodelançamento;
    private String datadacompra;
    private String situaçao;
    private String tipo;
    private String genero;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAnodelancamento() {
        return anodelançamento;
    }

    public void setAnodelancamento(String anodelançamento) {
        this.anodelançamento = anodelançamento;
    }

    public String getDatadacompra() {
        return datadacompra;
    }

    public void setDatadacompra(String datadacompra) {
        this.datadacompra = datadacompra;
    }

    public String getSituacao() {
        return situaçao;
    }

    public void setSituacao(String situaçao) {
        this.situaçao = situaçao;
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
