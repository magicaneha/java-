package mycon;
import java.sql.DriverManager;
import java.sql.*;
public class Mycon{
    private static Connection con;
    public static Connection getcon()
    {
        try
        {
            if(con==null || con.isClosed())
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/3itb_b2","root","root");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            }
        return con;
    }
    }
