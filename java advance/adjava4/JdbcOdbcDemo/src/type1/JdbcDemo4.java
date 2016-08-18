package type1;
import java.sql.*;
import java.util.Scanner;
public class JdbcDemo4 {
    public static void main(String[] args)throws Exception{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:msdsn");
    Statement st=con.createStatement();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Rno");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Enter Your Subject");
        String sub=sc.next();
        System.out.println("Enter Your City");
        String city=sc.next();
        System.out.println("Enter Your Mobno");
        long mob=sc.nextLong();
    int a=st.executeUpdate("insert into std values("+rno+",'"+name+"','"+sub+"','"+city+"',"+mob+")");
    if(a==1){
        System.out.println("1 row inserted");
    }
   con.close();
    }
    
}
