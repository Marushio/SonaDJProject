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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author a1320726
 */
@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idMusica;
    private int ano;
    private String nomeMusica;
    private double duracao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idAlbum")
    private Album album;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idArtista")
    private Artista artista;
    private String genero;
    private int isrc;

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
   
    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIsrc() {
        return isrc;
    }

    public void setIsrc(int isrc) {
        this.isrc = isrc;
    }

    public double getDuração() {
        return duracao;
    }

    public void setDuração(double duracao) {
        this.duracao = duracao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
