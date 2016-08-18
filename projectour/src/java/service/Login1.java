package service;
import java.sql.*;
import package1.MyCon;


public class Login1 
{ 

public static String checkfaculty(String fid, String password ) throws Exception
    {
        Connection con=MyCon.getConnection();
        PreparedStatement ps=con.prepareStatement("select fid,password,lavel from faculty where fid=? and password=?");
      ps.setString(1, fid);
      ps.setString(2,password);
      
      ResultSet rs=ps.executeQuery();
      if(rs.next())
            return rs.getString("lavel");
      return null;
    }
}