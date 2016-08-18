
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database2 
{
    public static void main(String[] args)
    {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            Connection con = DriverManager.getConnection("jdbc:odbc:pdsn");
            
            Statement stm = con.createStatement();
            
            ResultSet rs = stm.executeQuery("select * from studinfo");
            
            
            while(rs.next())
            {
                String name = rs.getString("sname");
                int age = rs.getInt("age");
                String branch = rs.getString("branch");
                 float marks = rs.getFloat("marks");
            
                System.out.println(name+age+branch+marks);
            }
            //String name = rs.getString(1);
            //int age = rs.getInt(2);
            //String branch = rs.getString(3);
            //float marks = rs.getFloat(4);
            
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(Database2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
