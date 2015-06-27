package Persistencia;
import Model.Artista;
import java.util.List;

/**
 *
 * @author a1320726
 */
public interface IArtistaDAO {
    public abstract void novoArtista(Artista artista);
    public abstract Artista obterArtista(String idArtista);
}
