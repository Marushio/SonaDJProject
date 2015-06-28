/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Model.Album;
import Persistencia.IAlbumDAO;
import Persistencia.IArtistaDAO;
import Persistencia.PersistenciaFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Marcio
 */
public class ControleTelaPlayList implements IControleTelaPlayList{
    public Collection obterArtistas() {        
        Collection artistas = new ArrayList(); 
     
        IArtistaDAO artistaDAO = PersistenciaFactory.obterArtistaDAO();
    
        artistas=artistaDAO.obterTodosArtista();
        return artistas;   
    }
    public Collection obterAlbuns(String artista) {
        Collection albuns = new ArrayList();
    
        IAlbumDAO albumDAO = PersistenciaFactory.obterAlbumDAO();
        if(artista.equals("Nenhum")) {
            albuns = null;
        } else {
            Collection todosAlbuns = albumDAO.obterTodosAlbum();
            Iterator i = todosAlbuns.iterator();
            while(i.hasNext()) {
                Album a = (Album) i.next();
                if (a.getArtista().getNomeArtista().equals(artista)) {
                    albuns.add(a);
                }
            }
        }
        return albuns;
    }    
    
}
