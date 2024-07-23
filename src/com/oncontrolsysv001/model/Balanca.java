package com.oncontrolsysv001.model;

import com.oncontrolsysv001.generic.GenericEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author itccolina
 */
@Entity
@Table(name = "tbbalanca")
public class Balanca extends GenericEntity {
    @Id
    private Long id;
    private String descricao;
    private String modelo;
    private String numeroSerie;
    
    public Balanca() {}

    public Balanca(Long id, String descricao, String modelo, String numeroSerie) {
        this.id = id;
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public Balanca(String descricao, String modelo, String numeroSerie) {
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    
}
