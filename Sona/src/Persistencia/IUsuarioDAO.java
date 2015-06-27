/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Usuario;

/**
 *
 * @author Luiz
 */
public interface IUsuarioDAO {
    public abstract void adicionarUsuario(Usuario usuario);
    public abstract Usuario obterUsuario(String login);
}
