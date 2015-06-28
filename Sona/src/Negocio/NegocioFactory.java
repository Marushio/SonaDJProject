/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.IMusicaDAO;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class NegocioFactory {
    
    public static IControleLogin obterControleLogin(){
        return new ControleLogin();
    }
    
    public static IControleCadastro obterControleCadastro(){
        return  new ControleCadatro();
    }
    
    public static IControleTelaPlayList obterControleTelaPlayList (){
        return  new ControleTelaPlayList();
    }
    public static MusicasList obterMusicaList(List list){
        return  new MusicasList(list);
    }
    public static TabelaModelo obterTabelaModelo(MusicasList ml){
        return  new TabelaModelo(ml);
    }
}
