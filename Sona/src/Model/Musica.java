/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

/**
 *
 * @author a1320726
 */
public class Musica {
    private int idMusica;
    private int ano;
    private String nomeMusica;
    private double duração;
    private int idAlbum;
    private int idArista;
    private String genero;
    private int isrc;
    
    
    

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
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
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
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
