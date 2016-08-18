
package model;
import java.sql.*;
import datasource.MyCon;

public class Login 
{
    public static boolean checkLogin(String unm , String pass) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from login where userName=? and password= ?");
        ps.setString(1, unm);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return true;
        }
        return  false;
    }
    
    
}
