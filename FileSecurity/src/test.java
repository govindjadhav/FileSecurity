
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadha
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EncrrptjButton1 = new javax.swing.JButton();
        DycryptjButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EncrrptjButton1.setText("Encrpt");
        EncrrptjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncrrptjButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(EncrrptjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 80, -1, -1));

        DycryptjButton2.setText("Dycrypt");
        DycryptjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DycryptjButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(DycryptjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 80, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Data security refers to the process of protecting data from unauthorized access and \n\n\n\ndata corruption throughout its lifecycle. Data security includes data encryption, hash\n\n\ning, tokenization, and key management practices that protect data across all applications and platforms.");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 410, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 470, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DycryptjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DycryptjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DycryptjButton2ActionPerformed

    private void EncrrptjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncrrptjButton1ActionPerformed
        // TODO add your handling code here:
        String key = "Swapnilrerererer";
        File inputFile = new File("D:\\Encryption And Dicryption\\Test222.txt");
       // File encryptedFile = new File("D:\\Dycrypt\\Sampale.encrypted");
         File decryptedFile = new File("D:\\Dycrypt\\Test23444.txt");
         
       try {
           
	    EncryptDecrypt.fileProcessor(Cipher.ENCRYPT_MODE,key,inputFile,inputFile);
            EncryptDecrypt.fileProcessor(Cipher.DECRYPT_MODE,key,inputFile,decryptedFile);
	    
	     System.out.println("Sucess");
	 } catch (Exception ex) {
	     System.out.println(ex.getMessage());
             ex.printStackTrace();
	 }
    }//GEN-LAST:event_EncrrptjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DycryptjButton2;
    private javax.swing.JButton EncrrptjButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
