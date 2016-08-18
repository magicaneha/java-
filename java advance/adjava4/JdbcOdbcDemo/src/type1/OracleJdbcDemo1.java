package type1;
import java.sql.*;
public class OracleJdbcDemo1 {
    public static void main(String[] args) {
        try {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       Connection con=DriverManager.getConnection("jdbc:odbc:odsn","scott","tiger");
       Statement st=con.createStatement();
      ResultSet rs= st.executeQuery("select ename,sal,job from emp");
           while(rs.next()){
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
           }
           con.close();
           
           
           
        } catch (Exception e) {e.printStackTrace();}
    }
}
