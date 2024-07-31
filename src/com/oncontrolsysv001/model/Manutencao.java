package com.oncontrolsysv001.model;

import com.oncontrolsysv001.generic.GenericEntity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author itccolina
 */
@Entity
@Table(name = "tbmanutencao")
@SequenceGenerator(name = "seq_tbmanutencao", sequenceName = "seq_tbmanutencao",initialValue = 1,allocationSize = 1)
public class Manutencao extends GenericEntity {
    @Id
    @GeneratedValue(generator = "seq_tbmanutencao", strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Impressora> impressoras;
    @Column(length = 100)
    private String caixaRetirada;
    @Column(length = 100)
    private String nota;
    
    public Manutencao() {}

    public Manutencao(List<Impressora> impressoras, String caixaRetirada, String nota) {
        this.impressoras = impressoras;
        this.caixaRetirada = caixaRetirada;
        this.nota = nota;
    }

    public Manutencao(Long id, List<Impressora> impressoras, String caixaRetirada, String nota) {
        this.id = id;
        this.impressoras = impressoras;
        this.caixaRetirada = caixaRetirada;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Impressora> getImpressoras() {
        return impressoras;
    }

    public void setImpressoras(List<Impressora> impressoras) {
        this.impressoras = impressoras;
    }

    public String getCaixaRetirada() {
        return caixaRetirada;
    }

    public void setCaixaRetirada(String caixaRetirada) {
        this.caixaRetirada = caixaRetirada;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
