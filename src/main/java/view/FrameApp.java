/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.Hashtable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author l a w t
 */
public class FrameApp extends javax.swing.JFrame {

    private static JScrollPane painelRolagem;
    private static JPanel painelTroca;
    private static CardLayout baralhoPaineis;
    private static Hashtable<String, JPanel> historicoPaineis;

    public FrameApp() {
        initComponents();
        ConfigPanels();
        trocaPainel("Login", new Login());

    }

    private void ConfigPanels() {
        this.setLayout(new BorderLayout());

        baralhoPaineis = new CardLayout();
        painelRolagem = new JScrollPane();
        painelTroca = new JPanel(baralhoPaineis);
        historicoPaineis = new Hashtable<>();

        this.add(painelRolagem);
        painelRolagem.setViewportView(this.painelTroca);
    }

    public static void trocaPainel(String nome, JPanel novoPainel) {
        if (!historicoPaineis.containsKey(nome)) {
            painelTroca.add(novoPainel, nome);
            baralhoPaineis.show(painelTroca, nome);
            painelTroca.setPreferredSize(novoPainel.getPreferredSize());
            historicoPaineis.put(nome, novoPainel);
        } else {
            baralhoPaineis.show(painelTroca, nome);
            painelTroca.setPreferredSize(historicoPaineis.get(nome).getPreferredSize());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultório Médico");
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
