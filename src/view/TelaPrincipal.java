/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import modeloConection.ConexaoBD;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    FormTatuador tela = new FormTatuador();
    FormUsuario telaUsu = new FormUsuario();
    FormCliente telaCli = new FormCliente();
    FormAgendammento telaAgenda = new FormAgendammento();
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.getConnection();
        setIcon();
    } 

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonCadTatuador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonCadCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadTatuador = new javax.swing.JMenuItem();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuAgendaHoje = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemAgendaTatuador = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 220, 70, 20);

        jLabelUsuario.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(100, 220, 180, 20);

        jButtonCadTatuador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tattoIcon.png"))); // NOI18N
        jButtonCadTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadTatuadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadTatuador);
        jButtonCadTatuador.setBounds(50, 50, 120, 80);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TATUADOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 140, 70, 14);

        jButtonCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/userIcon.png"))); // NOI18N
        jButtonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCliente);
        jButtonCadCliente.setBounds(210, 50, 130, 80);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CLIENTE ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 140, 60, 20);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendario.png"))); // NOI18N
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgenda);
        jButtonAgenda.setBounds(380, 50, 130, 80);

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGENDA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 140, 60, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 280);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadTatuador.setText("Tatuador");
        jMenuItemCadTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadTatuadorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadTatuador);

        jMenuItemCadCliente.setText("Cliente");
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadCliente);

        jMenuItemCadUsuario.setText("Usuário");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemCliente);

        jMenuBar1.add(jMenuRelatorios);

        jMenuAgendaHoje.setText("Agenda");

        jMenuItem1.setText("Agenda de Hoje");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAgendaHoje.add(jMenuItem1);

        jMenuItemAgendaTatuador.setText("Agenda Tatuador");
        jMenuItemAgendaTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaTatuadorActionPerformed(evt);
            }
        });
        jMenuAgendaHoje.add(jMenuItemAgendaTatuador);

        jMenuBar1.add(jMenuAgendaHoje);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(569, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadTatuadorActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
               if(tela == null){
                   tela = new FormTatuador();
                   tela.setVisible(true);
                   tela.setResizable(false);
               }else{
                   tela.setVisible(true);
                   tela.setResizable(false);
               }
                //FormTatuador tela = new FormTatuador();
                //tela.setVisible(true);    
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
       
    }//GEN-LAST:event_jMenuItemCadTatuadorActionPerformed

    private void jButtonCadTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadTatuadorActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(tela == null){
                   tela = new FormTatuador();
                   tela.setVisible(true);
                   tela.setResizable(false);
               }else{
                   tela.setVisible(true);
                   tela.setResizable(false);
               }
                //FormTatuador tela = new FormTatuador();
                //tela.setVisible(true);    
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
    }//GEN-LAST:event_jButtonCadTatuadorActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairMouseClicked

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaUsu == null){
                   telaUsu = new FormUsuario();
                   telaUsu.setVisible(true);
                   telaUsu.setResizable(false);
               }else{
                   telaUsu.setVisible(true);
                   telaUsu.setResizable(false);
               }
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
       try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaAgenda == null){
                   telaAgenda = new FormAgendammento();
                   telaAgenda.setVisible(true);
                   telaAgenda.setResizable(false);
               }else{
                   telaAgenda.setVisible(true);
                   telaAgenda.setResizable(false);
               }
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jButtonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClienteActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
               if(telaCli == null){
                   telaCli = new FormCliente();
                   telaCli.setVisible(true);
                   telaCli.setResizable(false);
               }else{
                   telaCli.setVisible(true);
                   telaCli.setResizable(false);
               }
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
    }//GEN-LAST:event_jButtonCadClienteActionPerformed

    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
               if(telaCli == null){
                   telaCli = new FormCliente();
                   telaCli.setVisible(true);
                   telaCli.setResizable(false);
               }else{
                   telaCli.setVisible(true);
                   telaCli.setResizable(false);
               }
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você não tem permissão para essa funcionalidade\n Contate o administrador do sistema");
        }
    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormAgenda tela = new FormAgenda();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemAgendaTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaTatuadorActionPerformed
        FormAgendaTatuador tela = new FormAgendaTatuador();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgendaTatuadorActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        Connection con = ConexaoBD.getConnection();
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Impressão do Relatório?", "Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
           String src = "C:/Users/gabri/OneDrive/Área de Trabalho/Desktop/Projeto/Tattoaria/src/rel/RelatórioCliente.jrxml";
           JasperPrint jasperprint = null;
           
           try {
            
            jasperprint = JasperFillManager.fillReport(src, null, con);
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao gerar Relatório");
        }
           
          JasperViewer view = new JasperViewer(jasperprint,false);
          view.setVisible(true);
        }   
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadCliente;
    private javax.swing.JButton jButtonCadTatuador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenuAgendaHoje;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAgendaTatuador;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadTatuador;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconT.png")));
    }
}