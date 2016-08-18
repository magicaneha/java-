package mycon;
import java.sql.*;
public class MyCon {
    private static Connection con;
    public static Connection getCon(){
        try {
            if(con==null||con.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity_db","root","");
            }
        } catch (Exception e) {
        e.printStackTrace();}
        return  con;
    }
}
