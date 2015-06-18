/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a1320726
 */
public class HibernateEntityManagerFactory {
    private static EntityManagerFactory emf = null; 
    
    private HibernateEntityManagerFactory() {
    }
    
    public static EntityManager getEntityManager() {
        
        try {
            if (emf == null)
                emf = Persistence.createEntityManagerFactory("SonaPU");
            return emf.createEntityManager();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
