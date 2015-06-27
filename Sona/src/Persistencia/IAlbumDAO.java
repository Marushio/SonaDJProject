/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Album;
import java.util.List;

/**
 *
 * @author Luiz
 */
public interface IAlbumDAO {
    public abstract void adicionarAlbum(Album album);
    public abstract List obterTodosAlbum();
    public abstract Album obterAlbum(int id);
}
