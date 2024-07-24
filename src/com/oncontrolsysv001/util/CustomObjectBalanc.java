package com.oncontrolsysv001.util;

import com.oncontrolsysv001.model.Balanca;

/**
 *
 * @author leandro
 */
public class CustomObjectBalanc extends Balanca {
    private Long id;
    private String descricao;
    private String modelo;
    private String numeroSerie;

    public CustomObjectBalanc() {
    }

    public CustomObjectBalanc(Long id, String descricao, String modelo, String numeroSerie) {
        this.id = id;
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "CustomObjectBalanc{" + "id=" + id + ", descricao=" + descricao + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + '}';
    }
    
}
