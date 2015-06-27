/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marcio
 */
@Entity
public class PlayList {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idPlayList;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Usuario")
    private String login;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Musica")
    private int idMusica;
    
    public int getIdPlayList() {
        return idPlayList;
    }

    public void setIdPlayList(int idPlayList) {
        this.idPlayList = idPlayList;
    }
 
  
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }
    
}
