/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Musica;
import Model.PlayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Marcio
 */
public class MusicaDAO implements IMusicaDAO {
    @Override
    public void adicionarMusica(Musica musica) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(musica);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(em!=null)
                em.close();
        }
    }

    @Override
    public List obterMusicas() {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List musicas = null;      
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Musica as o");
            musicas = q.getResultList();

            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return musicas;
    }

}
