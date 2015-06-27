/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Model.Album;
import Model.Artista;
import Model.Musica;
import Persistencia.IAlbumDAO;
import Persistencia.IArtistaDAO;
import Persistencia.IMusicaDAO;
import Persistencia.PersistenciaFactory;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class ControleCadatro implements IControleCadastro{

    @Override
    public void cadastrarMusica(Musica musica) {
        IMusicaDAO musicaDAO = PersistenciaFactory.obterMusicaDAO();
        musicaDAO.adicionarMusica(musica);
    }
    public void cadastrarArtista(Artista artista){
        IArtistaDAO artistaDAO = PersistenciaFactory.obterArtistaDAO();
        artistaDAO.novoArtista(artista);
    }
    public void cadastrarAlbum(Album album){
        IAlbumDAO albumDAO = PersistenciaFactory.obterAlbumDAO();
        albumDAO.adicionarAlbum(album);
    }
   
    @Override
    public  List obterTodosAlbum(){
        IAlbumDAO albumDAO = PersistenciaFactory.obterAlbumDAO();
        return albumDAO.obterTodosAlbum();
    }
    public  List obterTodosMusica(){
        IMusicaDAO musicaDAO = PersistenciaFactory.obterMusicaDAO();
        return musicaDAO.obterTodasMusicas();
    }
    public  Artista obterArtista(String id){
        IArtistaDAO artistaDAO = PersistenciaFactory.obterArtistaDAO();
        return artistaDAO.obterArtista(id);
    }
    public  Album obterAlbum(int id){
        IAlbumDAO albumDAO = PersistenciaFactory.obterAlbumDAO();
        return albumDAO.obterAlbum(id);
    }
    public  Musica obterMusica(int id){
        IMusicaDAO musicaDAO = PersistenciaFactory.obterMusicaDAO();
        return musicaDAO.obterMusicas(id);
    }
}
