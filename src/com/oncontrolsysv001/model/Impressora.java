package com.oncontrolsysv001.model;

import com.oncontrolsysv001.generic.GenericEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author itccolina
 */
@Entity
@Table(name = "tbimpressora")
@SequenceGenerator(name = "seq_tbimpressora", sequenceName = "seq_tbimpressora", initialValue = 1, allocationSize = 1)
public class Impressora extends GenericEntity {
    //31/07/2024 IMPRESSORA TERMICA BEMATECH 4200, NS:101000800000155332 MP-4200 TH | MASTIGANDO PAPEL - CAIXA FISICO 8 - RECOLHIDA PELA ASSIST TECN
    @Id
    @GeneratedValue(generator = "seq_tbimpressora", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 100)
    private String descricao;
    @Column(length = 24)
    private String modelo;
    @Column(length = 64)
    private String numeroSerie;
    //private String
    
    public Impressora() {}

    public Impressora(String descricao, String modelo, String numeroSerie) {
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public Impressora(Long id, String descricao, String modelo, String numeroSerie) {
        this.id = id;
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
