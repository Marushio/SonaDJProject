/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.IPlayListDAO;
import Persistencia.PersistenciaFactory;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Marcio
 */
public class ControleTelaPlayList implements IControleTelaPlayList{
    PersistenciaFactory persistenciaFactory;
    
    
    public Collection coletarFavoritos(String usuario) {        
        Collection Favoritos = new ArrayList(); 
        persistenciaFactory =  new PersistenciaFactory(); 
        IPlayListDAO playListDAO = persistenciaFactory.obterPlayListDAO();       
        Favoritos = playListDAO.obterPlayList(usuario);
        return Favoritos;   
    }
}
