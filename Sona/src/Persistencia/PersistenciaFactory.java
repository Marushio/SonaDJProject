/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Andre
 */
public class PersistenciaFactory {
    
    public static IArtistaDAO obterArtistaDAO() {
         return new ArtistaDAO();            
    }   
    
    public static IUsuarioDAO obterUsuarioDAO(){
        return  new UsuarioDAO();
    }
    public static IPlayListDAO obterPlayListDAO(){
        return  new PlayListDAO();
    }
    
    public static IMusicaDAO obterMusicaDAO(){
        return new MusicaDAO();
    }
}
