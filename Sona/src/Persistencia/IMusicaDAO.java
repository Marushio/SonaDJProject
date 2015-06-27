/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Luiz
 */
public interface IMusicaDAO {
    public abstract void adicionarMusica(Musica musica);
    public abstract List obterMusica(Musica musica);
}
