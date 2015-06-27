/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Luiz
 */
public class UsuarioDAO implements IUsuarioDAO{

    UsuarioDAO() {
        
    }
    
    @Override
    public void novoUsuario(Usuario usuario) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(em!=null)
                em.close();
        }
    }

    @Override
    public Usuario obterUsuario(String login) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManager();
        Usuario usuario = null;
        try{
            Query q = em.createQuery("SELECT object(o)"
                                    + "FROM Usuario as o"
                                    + "WHERE login = '"
                                    + login+ "'");
            usuario = (Usuario) q.getSingleResult();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(em!=null)
                em.close();
        }  
        return usuario;
    }
    
}
