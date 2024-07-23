package com.oncontrolsysv001.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leandro
 */
public class JpaUtil {
    private static final EntityManagerFactory entityManagerFactory;
    
    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("OnControlSysV001PU");
    }
    
    public static EntityManager openConnetion() {
        return entityManagerFactory.createEntityManager();
    }
    
    public static void closeConnection() {
        entityManagerFactory.close();
    }
}
