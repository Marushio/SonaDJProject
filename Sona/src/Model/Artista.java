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


/**
 *
 * @author a1320726
 */
@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idArista;
    private String nomeArtista;

    public int getIdArista() {
        return idArista;
    }

    public void setIdArista(int idArista) {
        this.idArista = idArista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    
}
