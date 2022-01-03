
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadha
 */

public class FileRead {
    String ufileName(File file){
        String fileName=file.getName();
         System.out.println(fileName);
        System.out.println(file);
        
        return fileName;
        
    }


     public static void main(File file) {
         
        
         
         
         
        try {
      
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
}
