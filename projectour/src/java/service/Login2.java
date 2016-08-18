package service;
import java.sql.*;
import package1.MyCon;


public class Login2 
{ 

public static String checkhod(String hid, String password ) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from hod where hid=? and password=?");
      ps.setString(1, hid);
      ps.setString(2,password);
      
      ResultSet rs=ps.executeQuery();
      if(rs.next())
            return rs.getString("lavel");
      return null;
    }
}