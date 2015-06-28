/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


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
        //marcasDisponiveis = marcaDAO.obterMarcasCadastrados();
        return artistas;   
    }
    public Collection obterAlbuns(String artista) {
        Collection modelosDisponiveis=new ArrayList();
        persistenciaFactory =  new PersistenciaFactory();
        IModeloDAO modeloDAO = persistenciaFactory.obterModeloDAO();
        if(marca.equals("Todos")) {
            modelosDisponiveis = modeloDAO.obterModelosCadastrados();
        } else {
            Collection modelosCadastrados = modeloDAO.obterModelosCadastrados();
            Iterator i = modelosCadastrados.iterator();
            while(i.hasNext()) {
                Modelo m = (Modelo) i.next();
                if (m.getMarca().getNome().equals(marca)) {
                    modelosDisponiveis.add(m);
                }
            }
        }
        return modelosDisponiveis;
    }    
    
}
