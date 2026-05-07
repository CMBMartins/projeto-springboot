package com.SpringBoot.projetosspringboot;

import jakarta.persistence.*;

@Entity
@Table(name = "planilhaeletrica")

public class PlanilhaEletrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projeto;
    private String circuito;
    private String descricao;
    private Double potenciatotal;
    private Double potenciacorrigida;
    private String tipocircuito;
    private Double correnteic;
    private Double correnteib;
    private String disjuntor;
    private String condutor;
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

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPotenciatotal() {
        return potenciatotal;
    }

    public void setPotenciatotal(Double potenciatotal) {
        this.potenciatotal = potenciatotal;
    }

    public Double getPotenciacorrigida() {
        return potenciacorrigida;
    }

    public void setPotenciacorrigida(Double potenciacorrigida) {
        this.potenciacorrigida = potenciacorrigida;
    }

    public String getTipocircuito() {
        return tipocircuito;
    }

    public void setTipocircuito(String tipocircuito) {
        this.tipocircuito = tipocircuito;
    }

    public Double getCorrenteic() {
        return correnteic;
    }

    public void setCorrenteic(Double correnteic) {
        this.correnteic = correnteic;
    }

    public Double getCorrenteib() {
        return correnteib;
    }

    public void setCorrenteib(Double correnteib) {
        this.correnteib = correnteib;
    }

    public String getDisjuntor() {
        return disjuntor;
    }

    public void setDisjuntor(String disjuntor) {
        this.disjuntor = disjuntor;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}