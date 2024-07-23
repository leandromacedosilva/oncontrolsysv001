package com.oncontrolsysv001.model;

import com.oncontrolsysv001.generic.GenericEntity;
import java.util.List;
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
@Table(name = "tbhardware")
@SequenceGenerator(name = "seq_tbhardware", sequenceName = "seq_tbhardware", initialValue = 1, allocationSize = 50)
public class Hardware extends GenericEntity {
    @Id
    @GeneratedValue(generator = "seq_tbhardware", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    @OneToMany
    private List<Balanca> balancas;
    
    public Hardware() {}

    public Hardware(Long id, String descricao, List<Balanca> balancas) {
        this.id = id;
        this.descricao = descricao;
        this.balancas = balancas;
    }

    public Hardware(String descricao, List<Balanca> balancas) {
        this.descricao = descricao;
        this.balancas = balancas;
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

    public List<Balanca> getBalancas() {
        return balancas;
    }

    public void setBalancas(List<Balanca> balancas) {
        this.balancas = balancas;
    }
    
    
    
    
}
