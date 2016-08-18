
package datasource;

import java.sql.*;

public class MyCon 
{
    private static Connection con=null;
    
    static
    {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                    
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
    
    public static Connection getConnection()throws Exception
    {
            if(con.isClosed())
            {
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");   
            }
            return con;
            
    }
    
}
