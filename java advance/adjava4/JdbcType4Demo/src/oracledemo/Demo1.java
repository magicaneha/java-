package oracledemo;
import java.sql.*;
public class Demo1 {
    public static void main(String[] args) {
        try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@dbsrv:1521:orcl","scott","tiger");
            System.out.println(con);
        } catch (Exception e) {
       e.printStackTrace(); }
 
    }
    
}
