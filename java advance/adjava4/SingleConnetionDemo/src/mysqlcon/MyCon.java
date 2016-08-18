package mysqlcon;
import java.sql.*;
public class MyCon {
    private static Connection con;
    public static Connection getCon(String user,String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java4",user,pass);
        } catch (Exception e) {
        e.printStackTrace();}
        return con;
    }
}
