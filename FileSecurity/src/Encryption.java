

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadha
 */
public class Encryption {
  

    
      public static void Encrypt(File file) {
          
       System.out.println("Encryption start.......");

        String key = "Swapnilrerererer";

        File inputFile = new File(file.getPath());
        // File encryptedFile = new File("D:\\Dycrypt\\Sampale.encrypted");
      //  File decryptedFile = new File("D:\\Dycrypt\\" + file.getName());

        try {

            EncryptDecrypt.fileProcessor(Cipher.ENCRYPT_MODE, key, inputFile, inputFile);
            //EncryptDecrypt.fileProcessor(Cipher.DECRYPT_MODE, key, inputFile, decryptedFile);

            
            JOptionPane.showMessageDialog(null, "File upload success ");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
	        
    }

   
}
