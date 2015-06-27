/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Album;
import Model.Artista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Luiz
 */
public class AlbumDAO implements IAlbumDAO{

    AlbumDAO() {
    }
    
    @Override
    public void adicionarAlbum(Album album) {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
      try{
          em.getTransaction().begin();
          em.persist(album);
          em.getTransaction().commit();
      }catch(Exception e){
          e.printStackTrace();
      }finally{
          if(em!=null){
              em.close();
          }
      }
    }


    public Album obterAlbum(int id) {
         EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        Album album = null;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Artista as o "
                                    + "WHERE idAlbum = '"
                                    +id+ "'");
            album = (Album)q.getSingleResult();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return album;
    }
    public List obterTodosAlbum() {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List album = null;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Artista as o "
                                    );
            album = q.getResultList();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return album;
    }
}
