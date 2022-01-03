
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadha
 */
public class Test2 {
    public static void main(String[] args) {
        File f=new File("D:\\Dycrypt\\Test.txt");
        if(f.exists()){
            System.out.println("file is exist");
        }else{
            System.out.println("file is not exist");
        }
    }
}
