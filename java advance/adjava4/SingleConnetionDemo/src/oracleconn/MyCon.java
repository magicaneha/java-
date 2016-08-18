package oracleconn;
import java.sql.*;
public class MyCon {
    private static Connection con;
    public static Connection 
            getCon(String user,String pass){
        try{     
        if(con==null||con.isClosed()){
       Class.forName("oracle.jdbc.OracleDriver");
   con=DriverManager.getConnection
 ("jdbc:oracle:thin:@dbsrv:1521:orcl",user,pass);
             }
        }catch(Exception e){e.printStackTrace();}
             return con;
    }
}
