/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Collection;

/**
 *
 * @author Marcio
 */
public interface IControleTelaPlayList {
    public abstract Collection obterArtistas();
    public abstract Collection obterAlbuns(String artista); 
}
