/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import Model.Album;
import Model.Artista;
import Model.Musica;
import Negocio.IControleCadastro;
import Negocio.IControleTelaPlayList;
import Negocio.NegocioFactory;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Luiz
 */
public class TelaCadastroMusica extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroMusica
     */
    public TelaCadastroMusica() {
        initComponents();
        IControleTelaPlayList controleTelaPlayList= NegocioFactory.obterControleTelaPlayList();
                
        Collection artistas =controleTelaPlayList.obterArtistas();
        Iterator i = artistas.iterator();
        chArtista.add("Nenhum");
        
        while(i.hasNext()) {
            Artista a = (Artista) i.next();
            chArtista.addItem(a.getNomeArtista());
        }
        this.atualizarCbAlbuns();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbNomeMusica = new javax.swing.JLabel();
        lbAnoMusica = new javax.swing.JLabel();
        lbDuracao = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tfNomeMusica = new javax.swing.JTextField();
        tfAnoMusica = new javax.swing.JTextField();
        tfDuracao = new javax.swing.JTextField();
        lbNomeArtista = new javax.swing.JLabel();
        lbNomeAlbum = new javax.swing.JLabel();
        btNovoArtista = new javax.swing.JButton();
        btNovoAlbum = new javax.swing.JButton();
        cbAlbum = new java.awt.Choice();
        chArtista = new java.awt.Choice();
        jlAvisos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setText("Tela de cadastro de música");

        lbNomeMusica.setText("Nome da música .:");

        lbAnoMusica.setText("Ano da musica .:");

        lbDuracao.setText("Duração.:");

        btCadastrar.setText("Nova musica");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        lbNomeArtista.setText("Artista.:");

        lbNomeAlbum.setText("Album.:");

        btNovoArtista.setText("Novo artista");
        btNovoArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoArtistaActionPerformed(evt);
            }
        });

        btNovoAlbum.setText("Novo album");
        btNovoAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoAlbumActionPerformed(evt);
            }
        });

        cbAlbum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlbumItemStateChanged(evt);
            }
        });

        chArtista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chArtistaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNomeMusica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeMusica))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAnoMusica)
                                    .addComponent(lbDuracao)
                                    .addComponent(lbNomeArtista)
                                    .addComponent(lbNomeAlbum))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAnoMusica)
                                    .addComponent(tfDuracao)
                                    .addComponent(cbAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNovoAlbum)
                            .addComponent(btNovoArtista))
                        .addGap(860, 860, 860))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTitulo)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeMusica)
                            .addComponent(tfNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAnoMusica)
                            .addComponent(tfAnoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDuracao)
                            .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeArtista)
                            .addComponent(btNovoArtista)))
                    .addComponent(chArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeAlbum)
                        .addComponent(btNovoAlbum))
                    .addComponent(cbAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btCadastrar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jlAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jlAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        String nomeMusica, nomeAlbum, nomeArtista;
        int anoMusica;
        double duracao;
      
        
        Album album = new Album();
        Musica musica = new Musica();
        Artista artista = new Artista();
        try{          
            anoMusica = Integer.parseInt(tfAnoMusica.getText());
            duracao = Double.parseDouble(tfDuracao.getText()); 
            musica.setAno(anoMusica);
            musica.setDuracao(duracao);
        }catch(Exception e){
            jlAvisos.setText("Ano e Duração devem ser numeros!");
           
        }
        try{ 
            nomeMusica = tfNomeMusica.getText();
            if(nomeMusica.equals("")){
               throw new IllegalArgumentException("A musica deve ter um nome!");
            } 
            IControleCadastro controleCadastro = NegocioFactory.obterControleCadastro();
            nomeArtista = chArtista.getSelectedItem();
            if(nomeArtista.equals("Nenhum")){
                throw new IllegalArgumentException("Por favor escolha um artista");
            }else{
                artista = controleCadastro.obterArtista(nomeArtista);
            }
            nomeAlbum = cbAlbum.getSelectedItem();
            
            if(nomeAlbum.equals("Nenhum")){
                throw new IllegalArgumentException("Por favor escolha album");
            }else{
                album = controleCadastro.obterAlbum(nomeAlbum);
            }
            musica.setNomeMusica(nomeMusica); 
            musica.setAlbum(album);
            musica.setArtista(artista);
           
            controleCadastro.cadastrarMusica(musica);
            super.revalidate();
            super.repaint();
            this.dispose();
        }catch(Exception e){
            jlAvisos.setText(e.getMessage());
           
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btNovoArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoArtistaActionPerformed
        // TODO add your handling code here:
        TelaCadastroArtista tca = new TelaCadastroArtista();
        tca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btNovoArtistaActionPerformed
    
    private void atualizarCbAlbuns(){
        cbAlbum.removeAll();
        String artista = chArtista.getSelectedItem();
        
        IControleTelaPlayList controleTelaPlayList= NegocioFactory.obterControleTelaPlayList();
                
        Collection albuns =controleTelaPlayList.obterAlbuns(artista);
     
        
        Iterator i = albuns.iterator();
        
        while(i.hasNext()) {
            if(i!=null){
                try{
                    Album a = (Album) i.next();
                    cbAlbum.addItem(a.getNomeAlbum());
                }catch(Exception e){
                    cbAlbum.add("Nenhum");
                }
            }else{
                cbAlbum.add("Nenhum");
            }
        }
        
    }
    private void btNovoAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoAlbumActionPerformed
        // TODO add your handling code here:
        TelaCadastroAlbum tca = new TelaCadastroAlbum(null);
        tca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btNovoAlbumActionPerformed

    private void cbAlbumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlbumItemStateChanged
        
    }//GEN-LAST:event_cbAlbumItemStateChanged

    private void chArtistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chArtistaItemStateChanged
          atualizarCbAlbuns();
    }//GEN-LAST:event_chArtistaItemStateChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovoAlbum;
    private javax.swing.JButton btNovoArtista;
    private java.awt.Choice cbAlbum;
    private java.awt.Choice chArtista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAvisos;
    private javax.swing.JLabel lbAnoMusica;
    private javax.swing.JLabel lbDuracao;
    private javax.swing.JLabel lbNomeAlbum;
    private javax.swing.JLabel lbNomeArtista;
    private javax.swing.JLabel lbNomeMusica;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfAnoMusica;
    private javax.swing.JTextField tfDuracao;
    private javax.swing.JTextField tfNomeMusica;
    // End of variables declaration//GEN-END:variables
}
