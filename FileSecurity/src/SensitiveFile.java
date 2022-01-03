


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class SensitiveFile {
    
    public static boolean sensitiveData(File f) throws IOException{
        boolean present;
         //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s;     
      String input[]={"password","username"};   // Input word to be searched
      int count=0;   //Intialize the word to zero
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
          System.out.println();
         words=s.split(" ");  //Split the word using space
          for (int i = 0; i < input.length; i++) {
              for (String word : words) 
          {
                 if (word.contains(input[i]))   //Search for the given word
                 {
                   count++;    //If Present increase the count by one
                 }
          }
          }
          
      }
      if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given word is present for "+count+ " Times in the file");
         present=true;
         
      }
      else
      {
         System.out.println("The given word is not present in the file");
         present=false;
      }
      
         fr.close();
        return present;
        
    }

   
}
