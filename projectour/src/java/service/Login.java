
package service;
import java.sql.*;
import package1.MyCon;


public class Login 
{
    
    public static String checkLogin(String rno) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from login where rno=?");
      ps.setString(1, rno);  
      
      ResultSet rs=ps.executeQuery();
      if(rs.next())
            return rs.getString("lavel");
      return null;
    }
   
     
    public static String checkdirector(String did, String password ) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from director where did=? and password=?");
      ps.setString(1, did);
      ps.setString(2,password);
      
      ResultSet rs=ps.executeQuery();
      if(rs.next())
            return rs.getString("lavel");
      return null;
    }
    
}
