/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

/**
 *
 * @author Marcio
 */
public class AtualizaTabela implements Runnable{
    private TelaPlayList tela;

    public AtualizaTabela(TelaPlayList tela) {
        this.tela = tela;
    }

    public void run() {
        try{
            while(true){
                tela.atualizaTabela();
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            
        }
        
    }
    

}
