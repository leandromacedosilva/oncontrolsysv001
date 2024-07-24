package com.oncontrolsysv001.driver;

import com.oncontrolsysv001.model.Balanca;
import com.oncontrolsysv001.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author leandro
 */
public class BalancaSelect {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnetion();
        em.getTransaction().begin();
        String query = "SELECT b Balanca b WHERE b.descricao LIKE :descricao";
        Query queryh = em.createNamedQuery(query);
        queryh.setParameter("descricao", "%balanc%");
        List<Balanca> balancas = queryh.getResultList();
        System.out.println("" + balancas);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
