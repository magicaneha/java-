package type1;
import java.sql.*;
public class JdbcDemo3 {
    public static void main(String[] args)throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:msdsn");
    Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from std");
               while(rs.next())
               {
                   System.out.println("rno="+rs.getInt(1)+" name="+rs.getString(2));
               }
                   con.close();
               
    }
    
}
