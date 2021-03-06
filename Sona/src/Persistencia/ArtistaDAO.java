/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import Model.Artista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author a1320726
 */
public class ArtistaDAO implements IArtistaDAO{
    
    ArtistaDAO(){   
    }
    

    public void novoArtista(Artista artista) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManager();
      try{
          em.getTransaction().begin();
          em.persist(artista);
          em.getTransaction().commit();
      }catch(Exception e){
          e.printStackTrace();
      }finally{
          if(em!=null){
              em.close();
          }
      }
    }

 
    public Artista obterArtista(String nomeArtista) {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        Artista artista = null;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Artista as o "
                                    + "WHERE nomeArtista = '"
                                    + nomeArtista + "'");
            artista = (Artista) q.getSingleResult();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return artista;
    }
    
    public List obterTodosArtista() {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List artista = null;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Artista as o "
                                    );
            artista = q.getResultList();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return artista;
    }
}
