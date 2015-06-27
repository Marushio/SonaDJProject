/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Luiz
 */
public class NegocioFactory {
    public static IControleLogin obterControleLogin(){
        return new ControleLogin();
    }
}
