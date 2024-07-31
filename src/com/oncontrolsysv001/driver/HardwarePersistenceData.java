package com.oncontrolsysv001.driver;

import com.oncontrolsysv001.model.Balanca;
import com.oncontrolsysv001.model.Hardware;
import com.oncontrolsysv001.util.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class HardwarePersistenceData {
    public static void main(String[] args) {
                
        EntityManager em = JpaUtil.openConnetion();
        em.getTransaction().begin();
        
        Balanca balanca001 = new Balanca("balanca toledo", "8217", "8372829");
        Balanca balanca002 = new Balanca("balanca toledo", "8217", "1172843");
        Balanca balanca003 = new Balanca("balanca toledo", "8217", "4172872");
        Balanca balanca004 = new Balanca("balanca toledo", "8217", "9872800");
        Balanca balanca005 = new Balanca("balanca toledo", "8217", "9072213");
        
        List<Balanca> balancas = new ArrayList<>();
        balancas.add(balanca001);
        balancas.add(balanca002);
        balancas.add(balanca003);
        balancas.add(balanca004);
        balancas.add(balanca005);
        
        for(Balanca b : balancas) {
            em.persist(b);
        }
        
        Hardware hardware001 = new Hardware();
        hardware001.setDescricao("balanca");
        hardware001.setBalancas(balancas);
        em.persist(hardware001);
        
        em.getTransaction().commit();
        JpaUtil.closeConnection();
        
    }
}
