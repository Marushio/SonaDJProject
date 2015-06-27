/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Model.Usuario;
import Persistencia.IUsuarioDAO;
import Persistencia.PersistenciaFactory;

/**
 *
 * @author Luiz
 */
public class ControleLogin implements IControleLogin{

    ControleLogin() {
        
    }

    @Override
    public Usuario logar(String login, String senha) {
        IUsuarioDAO usuarioDAO = PersistenciaFactory.obterUsuarioDAO();
        Usuario usuario = usuarioDAO.obterUsuario(login);
        if(senha.equals(usuario.getSenha()))
            return usuario;
        return null;
    }

    @Override
    public boolean cadastrar(String login, String senha) {
        Usuario usuario = new Usuario();
        IUsuarioDAO usuarioDAO = PersistenciaFactory.obterUsuarioDAO();
        if(usuarioDAO.obterUsuario(login)==null){
            usuario.setLogin(login);
            usuario.setSenha(senha);
            usuarioDAO.novoUsuario(usuario);
            return true;
        }else{
            System.out.println("Usuário já cadastrado");
            return false;
        }
            
    }
    
    
}
