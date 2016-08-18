package type1;
import java.sql.*;
public class JdbcDemo2 {
    public static void main(String[] args)throws Exception{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:msdsn");
    Statement st=con.createStatement();
    int a=st.executeUpdate("insert into std values (103,'mohan','java','indore',12345)");
    if(a==1){
        System.out.println("1 row inserted");
    }
   con.close();
    }
    
}
