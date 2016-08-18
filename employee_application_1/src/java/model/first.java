
package model;

import java.sql.ResultSet;
import  java.sql.*;

public class first  
  
{ 
        private String eid,fnm,lnm,mobno,email,comp;
       

    public first() {
    }
         
    

    public first(String eid,String fnm,String lnm,String mobno,String email,String comp) {
        this.eid = eid;
        this.fnm = fnm;
        this.lnm = lnm;
        this.mobno = mobno;
        this.email = email;
        this.comp=comp;
    }
        
        

    public String geteid() {
        return eid;
    }
public String getfnm() {
        return fnm;
    }
public String getlnm() {
        return lnm;
    }
 public String getemail() {
        return email;
    }
public String getcomp() {
        return comp;
    }
 public String getmobno() {
        return mobno;
    }
    public void seteid(String eid) {
        this.eid = eid;
    }

    
    public void setfnm(String fnm) {
        this.fnm =fnm ;
    }

   
    public void setlnm(String lnm) {
        this.lnm = lnm;
    }

   

    public void setemail(String email) {
        this.email = email;
    }

    
    public void setmobno(String mobno) {
        this.mobno = mobno;
    }

   

    public void setcomp(String comp) {
        this.comp = comp;
    }
    

   
//    public boolean insertStudent() throws Exception
//    {
//      
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
//            PreparedStatement ps=con.prepareStatement("insert into employeedetails values(?,?,?,?,?,?)");
//
//            ps.setString(1, eid);
//            ps.setString(2, fnm);
//            ps.setString(3, lnm);
//            ps.setString(5, email);
//            ps.setString(4, mobno);
//            ps.setString(6, comp);
//            int i=ps.executeUpdate();
//            if(i>0)
//            {
//                  return  true;
//            }
//            return false;
//     
//    }
//
//
//    public boolean deleteStudent() throws Exception 
//    {
//          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
//            PreparedStatement ps1=con.prepareStatement("delete from employeedetails where eid=?");
//            ps1.setString(1, eid);
//              int i=ps1.executeUpdate();
//            if(i>0)
//            {
//                  return  true;
//            }
//            return false;
//    }

  
    public boolean updateDetails() throws Exception {
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
            PreparedStatement ps2=con.prepareStatement("update employeedetails set fnm= ? , lnm= ? ,  mobno= ? ,  email= ? where eid = ? ");
              
            
          
            ps2.setString(1,eid);
               ps2.setString(2,fnm);
                  ps2.setString(3,lnm);
                     ps2.setString(4,mobno);
                     ps2.setString(5,email);
                ps2.setString(6,comp);        
            int i=ps2.executeUpdate();
            if(i>0)
            {
                  return  true;
            }
            return false;
         
    }
       
    public first searchStudent() throws Exception
    {
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");         
            PreparedStatement ps=con.prepareStatement("select * from employeedetails where eid=?");
            ps.setString(1, eid);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                first s=new first();
                s.seteid(rs.getString(1));
                s.setfnm(rs.getString(2));
                s.setlnm(rs.getString(3));
                s.setmobno(rs.getString(4));
                s.setemail(rs.getString(5));
                 s.setcomp(rs.getString(6));
                return  s;
            }
            return null;
    }
    }

    

