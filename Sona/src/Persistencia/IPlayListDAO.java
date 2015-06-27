/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.PlayList;
import java.util.List;

/**
 *
 * @author Marcio
 */
public interface IPlayListDAO {
    public abstract void adicionarPlayList(PlayList playList);
    public abstract List obterPlayList(PlayList playList);
    
}
