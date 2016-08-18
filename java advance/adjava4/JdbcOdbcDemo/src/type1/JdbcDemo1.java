package type1;
import java.sql.*;
public class JdbcDemo1 {
    public static void main(String[] args)throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:msdsn");
    Statement st=con.createStatement();
    st.execute("create table std(rno int,name varchar(10),sub varchar(10),city varchar(10),mobno int)");
    con.close();
    }
    
}
