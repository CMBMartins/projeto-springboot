package com.SpringBoot.projetosspringboot;

import jakarta.persistence.*;

@Entity
@Table(name = "bancoshowsfilmes")
public class BancoShowFilmes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String titulo;
    private String artista;
    private String anodelancamento;
    private String datadacompra;
    private String situacao;
    private String tipo;
    private String genero;
    private String usuario;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        return anodelancamento;
    }

    public void setAnodelancamento(String anodelancamento) {
        this.anodelancamento = anodelancamento;
    }

    public String getDatadacompra() {
        return datadacompra;
    }

    public void setDatadacompra(String datadacompra) {
        this.datadacompra = datadacompra;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
