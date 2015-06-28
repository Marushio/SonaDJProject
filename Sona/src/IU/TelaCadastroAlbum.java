/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import Model.Album;
import Model.Artista;
import Negocio.IControleCadastro;
import Negocio.IControleTelaPlayList;
import Negocio.NegocioFactory;
import Persistencia.PersistenciaFactory;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class TelaCadastroAlbum extends javax.swing.JFrame {
private Artista artista=null;
    /**
     * Creates new form TelaCadastroAlbum
     */
    public TelaCadastroAlbum(Artista artista) {
        this.artista = artista;
        initComponents();
        IControleTelaPlayList controleTelaPlayList= NegocioFactory.obterControleTelaPlayList();
                
        Collection artistas =controleTelaPlayList.obterArtistas();
        Iterator i = artistas.iterator();
        chArtista.add("Nenhum");
        
        while(i.hasNext()) {
            Artista a = (Artista) i.next();
            chArtista.addItem(a.getNomeArtista());
        }
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
        lbTituloTela = new javax.swing.JLabel();
        lbNomeAlbum = new javax.swing.JLabel();
        lbAnoAlbum = new javax.swing.JLabel();
        lbIsrc = new javax.swing.JLabel();
        tfNomeAlbum = new javax.swing.JTextField();
        tfIsrc = new javax.swing.JTextField();
        tfAnoAlbum = new javax.swing.JTextField();
        lbNomeArtista = new javax.swing.JLabel();
        btSalvarAlbum = new javax.swing.JButton();
        btNovoArtista = new javax.swing.JButton();
        chArtista = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTituloTela.setText("Tela de cadastro de Album");

        lbNomeAlbum.setText("Nome do album.:");

        lbAnoAlbum.setText("Ano do album.:");

        lbIsrc.setText("ISRC.:");

        lbNomeArtista.setText("Artista.:");

        btSalvarAlbum.setText("Salvar Album");
        btSalvarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlbumActionPerformed(evt);
            }
        });

        btNovoArtista.setText("Novo Artista");
        btNovoArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoArtistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloTela)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbIsrc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIsrc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNomeAlbum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAnoAlbum)
                                    .addComponent(lbNomeArtista))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAnoAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(chArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovoArtista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btSalvarAlbum)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTituloTela)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeAlbum)
                    .addComponent(tfNomeAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsrc)
                    .addComponent(tfIsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnoAlbum)
                    .addComponent(tfAnoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeArtista)
                        .addComponent(btNovoArtista))
                    .addComponent(chArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvarAlbum)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlbumActionPerformed
        // TODO add your handling code here:
        try{
            Artista artista = new Artista();
            
            IControleCadastro controleCadastro = NegocioFactory.obterControleCadastro();
            String nomeArtista = chArtista.getSelectedItem();
            artista=controleCadastro.obterArtista(nomeArtista);
            Album album = new Album();
            album.setNomeAlbum(tfNomeAlbum.getText());
            album.setAno(Integer.parseInt(tfAnoAlbum.getText()));
            album.setIsrc(Integer.parseInt(tfIsrc.getText()));
            album.setArtista(artista);
            controleCadastro.cadastrarAlbum(album);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Coloque apenas numeros nos campos Ano e ISRC");
        }
    }//GEN-LAST:event_btSalvarAlbumActionPerformed

    private void btNovoArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoArtistaActionPerformed
        // TODO add your handling code here:
        TelaCadastroArtista tca = new TelaCadastroArtista();
        tca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btNovoArtistaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovoArtista;
    private javax.swing.JButton btSalvarAlbum;
    private java.awt.Choice chArtista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAnoAlbum;
    private javax.swing.JLabel lbIsrc;
    private javax.swing.JLabel lbNomeAlbum;
    private javax.swing.JLabel lbNomeArtista;
    private javax.swing.JLabel lbTituloTela;
    private javax.swing.JTextField tfAnoAlbum;
    private javax.swing.JTextField tfIsrc;
    private javax.swing.JTextField tfNomeAlbum;
    // End of variables declaration//GEN-END:variables
}
