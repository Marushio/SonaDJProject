/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Model.Musica;
import Persistencia.IMusicaDAO;
import Persistencia.PersistenciaFactory;

/**
 *
 * @author Luiz
 */
public class ControleCadatroMusica implements IControleCadastroMusica{

    @Override
    public void cadastrarMusica(Musica musica) {
        IMusicaDAO musicaDAO = PersistenciaFactory.obterMusicaDAO();
        musicaDAO.adicionarMusica(musica);
    }
    
}
