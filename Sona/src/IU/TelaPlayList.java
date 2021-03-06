/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;


import Negocio.TabelaModelo;
import Negocio.MusicasList;
import Model.Usuario;
import Negocio.IControleTelaPlayList;
import Negocio.NegocioFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class TelaPlayList extends javax.swing.JFrame {
private Usuario usuario=null;
    /**
     * Creates new form TelaPlayList
     */
    public TelaPlayList(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        jlbUsuario.setText(usuario.getLogin());
        atualizaTabela();
        Thread atualizar = new Thread ( new AtualizaTabela(this));
        atualizar.start();
        
        //otem marcas e adicionar ao combobox
       
        
        //jcbFavoritos.addItem("Todos");
        
        
      
    }
    public void atualizaTabela(){
        IControleTelaPlayList controlerTelaPlayList;
        controlerTelaPlayList = NegocioFactory.obterControleTelaPlayList();
        List m =controlerTelaPlayList.obterMusicas();
        MusicasList musicasList= NegocioFactory.obterMusicaList(m);
        TabelaModelo tabelaModelo = NegocioFactory.obterTabelaModelo(musicasList); 
        jTable1.setModel(tabelaModelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbUsuario = new javax.swing.JLabel();
        btAddNovaMusica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbUsuario.setText("Usuario");
        jlbUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btAddNovaMusica.setText("Add nova musica");
        btAddNovaMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNovaMusicaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddNovaMusica)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jlbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAddNovaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddNovaMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNovaMusicaActionPerformed
        
        TelaCadastroMusica tp = new TelaCadastroMusica(); 
        tp.setVisible(true);
    }//GEN-LAST:event_btAddNovaMusicaActionPerformed
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddNovaMusica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbUsuario;
    // End of variables declaration//GEN-END:variables
}
