
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
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

public class DbConnection {
     public static void Qary(String q)
    {
              try 
	       {
                    Class.forName("com.mysql.jdbc.Driver"); //1
                    System.out.println("Driver Load Success");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datasecurity","root","7764");//2
                    System.out.println("Connection Success");
			
			
			
			Statement stmt = con.createStatement();
			
			
			PreparedStatement statement=con.prepareStatement(q);
			
			stmt.executeUpdate(q);
			
			
			
			con.close();//5
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver Load Problem : "+e);
		}
		catch (SQLException e) 
		{
			System.out.println("SQL Probelm : "+e);
		}
        
       }
   public static String userditailse(String Q){
       
         String fullname="";
        try {
            //1
            System.out.println("Driver Load Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datasecurity", "root", "7764");//2
            Statement stmt = con.createStatement();
            PreparedStatement statement = con.prepareStatement("select *from userdetails where email='" + Q+ "'");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                fullname = rs.getString("fullName");
                
            }

            con.close();//5
        } catch (SQLException e) {
            System.out.println("SQL Probelm : " + e);
        }
         return fullname;
       
       
   }
       
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       DbConnection con=new DbConnection();
       con.Qary("select *from login where username='govind' and password='jadhav123'");
    }
   
    
}
