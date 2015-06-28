/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;


import Model.Musica;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a132067x
 */
public class TabelaModelo extends AbstractTableModel implements Observer{
    //instancia a prateleira  
    private  MusicasList musicasList;
    
    //cria um vetro de string para os nomes das colunas
    String[] nomeColunas = {"Musica","Duraçao","Album", "Artista"}; 
    private Object musica;
    
    
    //metodo construtor 
    //deve receber o arraylist neste cso prateira para inicializar com um valor
    public TabelaModelo(MusicasList musicasList){
        this.musicasList=musicasList;
        musicasList.addObserver(this);
    }
    
    //conta quantas linhas tera a tabela que é o tabanho 
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return musicasList.size();
     }
    //informa quantas colunas terá a tabela que é o tamanho do vetor de nome das colunas
    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    //informa o nome das colunas
    @Override
    public String getColumnName(int col){
        return nomeColunas[col];       
    }
    //informa que as colunas podem ser editadas
   
    
    @Override
    //retona os valores da pratelira para as colunas da tabela
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Musica musica = (Musica) musicasList.get(rowIndex);        
        switch(columnIndex){
            case 0:
                return musica.getNomeMusica();
            case 1:
                return musica.getDuracao();
            case 2:
                return musica.getAlbum().getNomeAlbum();
            case 3:
                return musica.getArtista().getNomeArtista();
            default:
                return "Ocoreu um erro";
        }
        
    }    

    @Override
    //infoma para a tabela ser atualizada caso ocorra alteração no arraylist que é observado
    public void update(Observable o, Object o1) {
          this.fireTableDataChanged();
    }
}
