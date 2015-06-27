/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Model.Usuario;

/**
 *
 * @author Luiz
 */
public interface IControleLogin {
    public abstract Usuario logar(String login, String senha);
    public abstract boolean cadastrar(String login, String senha);
}
