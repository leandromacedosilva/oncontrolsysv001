package com.oncontrolsysv001.driver;

import com.oncontrolsysv001.model.Balanca;
//import com.oncontrolsysv001.util.CustomObjectBalanc;
import com.oncontrolsysv001.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author leandro
 */
public class QueryBalancWithTypedQuery {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnetion();
        em.getTransaction().begin();
        String query = "SELECT NEW Balanca(b.id,b.descricao,b.modelo) FROM Balanca b";
        TypedQuery<Balanca> consult = em.createQuery(query, Balanca.class);
        List<Balanca> result = consult.getResultList();
        System.out.println("");
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("RESULTADO: " + result);
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("");
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
