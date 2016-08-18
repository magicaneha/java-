package type1;
import java.sql.*;
import java.util.Scanner;
public class JdbcDemo5 {
    public static void main(String[] args)throws Exception{
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:msdsn");
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
        int mob=sc.nextInt();
  PreparedStatement pst=
 con.prepareStatement("insert into std values(?,?,?,?,?)");
      pst.setInt(1, rno);
      pst.setString(2, name);
      pst.setString(3, sub);
      pst.setString(4, city);
      pst.setInt(5, mob);
       int a=pst.executeUpdate();
       if(a==1){
           System.out.println("i record inserted");
       }
        } catch (Exception e) {
        e.printStackTrace();}
    }
    
}
