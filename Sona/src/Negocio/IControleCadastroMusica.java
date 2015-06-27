/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Model.Album;
import Model.Artista;
import Model.Musica;
import java.util.List;

/**
 *
 * @author Luiz
 */
public interface IControleCadastroMusica {
    public abstract void cadastrarMusica(Musica musica); 
    public abstract void cadastrarAlbum(Album album);
    public abstract void cadastrarArtista(Artista artista);
    public abstract List obterTodosAlbum();
    public abstract List obterTodosMusica();
    public abstract Artista obterArtista(String id);
    public abstract Album obterAlbum(int id);
    public abstract Musica obterMusica(int id);   
}
