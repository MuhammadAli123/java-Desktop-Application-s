package pkgfinal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class conn2 {
    
    private Connection conn =null;
    
    public static Connection DB(){
    
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ali\\Documents\\NetBeansProjects\\final\\SalPur.sqlite");
        System.out.println("connected");
      return conn;
    }
    catch(Exception e){
    
      JOptionPane.showMessageDialog(null,"connection failure");
      return null;
    }
       //   return null;
        
    
    }
}
