/*
   Link do tutorial 
 * http://aquilesburlamaqui.wikidot.com/javaspeech
 */

package sona;

import Model.Artista;
import Persistencia.IArtistaDAO;
import Persistencia.PersistenciaFactory;

/**
 *
 * @author a1320726
 */
public class Sona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista= new Artista();
        artista.setNomeArtista("Cauvim");
        PersistenciaFactory persistenciaFactory=new PersistenciaFactory();
        IArtistaDAO artistaDAO = persistenciaFactory.obterArtistaDAO();
        artistaDAO.novoArtista(artista);
    }
    
}
