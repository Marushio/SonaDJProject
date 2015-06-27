/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.PlayList;
import Model.Usuario;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import static org.hibernate.hql.internal.antlr.HqlSqlTokenTypes.WHERE;

/**
 *
 * @author Marcio
 */
public class PlayListDAO implements IPlayListDAO{
    @Override
    public void adicionarPlayList(PlayList playList) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(playList);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(em!=null)
                em.close();
        }
    }

    @Override
    public List obterPlayList(PlayList playList) {
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List playlist = null;      
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM obterPlayList as o"
                                    + "WHERE login = '"
                                    + playList.getUsuario().getLogin() + "'");
            playlist = q.getResultList();

            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return playlist;
    }    
}
