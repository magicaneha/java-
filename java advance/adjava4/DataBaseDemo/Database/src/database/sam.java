/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paramstudent
 */
public class sam {


    public static void main(String[] args)
    {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            Connection con = DriverManager.getConnection("jdbc:odbc:my2");
            
            Statement stm = con.createStatement();
            
            ResultSet rs = stm.executeQuery("select * from stuinfo2");
            
            
            rs.next();
            
           String name = rs.getString(1);
            int age = rs.getInt(2);
            String branch = rs.getString(3);
            float marks = rs.getFloat(4);
            
          //  String name = rs.getString("sname");
            //int age = rs.getInt("age");
           // String branch = rs.getString("branch");
            //float marks = rs.getFloat("marks");
            
            System.out.println(name+age+branch+marks);
                    
        } catch (SQLException ex) {
            Logger.getLogger(database.Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    

