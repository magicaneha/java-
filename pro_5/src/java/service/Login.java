
package service;
import java.sql.*;
import datasource.MyCon;

public class Login 
{
    
    public static String checkLogin(String unm , String pass) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from student where rno=?");
      ps.setString(1, unm);  
      ps.setString(2, pass);
      ResultSet rs=ps.executeQuery();
      if(rs.next())
            return rs.getString("lavel");
      return null;
    }
    
}
