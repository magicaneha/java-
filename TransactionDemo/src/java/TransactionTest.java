import java.sql.*;
public class TransactionTest{
    public static void main(String []args){
        {
            Connection con=null;
            try{
                 con=mycon.Mycon.getcon();
                con.setAutoCommit(false);
                PreparedStatement pst=con.prepareStatement("update amount set Balance=Balance-500 where name=? ");
                pst.setString(1,"A");
                int p=pst.executeUpdate();
                 PreparedStatement pst1=con.prepareStatement("update amount set Balance=Balance+500 where name=? ");
                pst1.setString(1,"B");
                int p1=pst1.executeUpdate();
                con.commit();
                
            }
            catch(Exception e)
            {
                try{
                con.rollback();
                }
                catch(Exception e1)
                {}
                e.printStackTrace();
            }
        }
        
    }
} 