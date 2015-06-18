package Persistencia;
import Model.Artista;

/**
 *
 * @author a1320726
 */
public interface IArtistaDAO {
    public abstract void novoArtista(Artista artista);
    public abstract Artista obterArtista(String idArtista);
}
