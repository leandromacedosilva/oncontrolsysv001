package com.oncontrolsysv001.driver;

import com.oncontrolsysv001.model.Balanca;
import com.oncontrolsysv001.util.CustomObjectBalanc;
import com.oncontrolsysv001.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author leandro
 */
public class BalancaSelectWithParam {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnetion();
        em.getTransaction().begin();
        
        String query = "SELECT b.id, b.descricao, b.modelo FROM Balanca b";
        
        TypedQuery<Object[]> consult = em.createQuery(query, Object[].class);
        List<Object[]> balancas = consult.getResultList();
        for(Object[] line : balancas) {
            System.out.println("|");
            System.out.println("|.............................................................................................");
            System.out.println("|--------------------------- LISTA DE BALANCAS -----------------------------------------------");
            System.out.println("|" + "id" + line[0] + "descricao" + line[1]+ "modelo" + line[2]);
            System.out.println("|.............................................................................................");
            System.out.println("|");
        }
        
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
