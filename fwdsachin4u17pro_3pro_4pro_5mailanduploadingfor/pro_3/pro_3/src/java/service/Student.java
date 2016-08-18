
package service;
import impl.StudentImpl;
import  java.sql.*;

public class Student  implements StudentImpl
{
  
        private int rno;
        private String nm;
        private int phy,chem,maths;

    public Student() {
    }

    public Student(int rno, String nm, int phy, int chem, int maths) {
        this.rno = rno;
        this.nm = nm;
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
    }
        
        

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
        System.out.println("chem.....set");
    }

    public int getMath() {
        return maths;
    }

    public void setMath(int maths) {
        this.maths = maths;
        System.out.println("math.....set");
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
        System.out.println("nm........set");
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
        System.out.println("phy........set");
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
        System.out.println("rno........set");
    }
    public int total()
    {
        return     phy+chem+maths;
    }

    @Override
    public boolean insertStudent() throws Exception
    {
      
            Connection con=datasource.MyCon.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
            ps.setInt(1, rno);
            ps.setString(2, nm);
            ps.setInt(3, phy);
            ps.setInt(4, chem);
            ps.setInt(5, maths);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                  return  true;
            }
            return false;
     
    }

    @Override
    public boolean deleteStudent() throws Exception 
    {
            Connection con=datasource.MyCon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from student where rno=?");
            ps.setInt(1, rno);
              int i=ps.executeUpdate();
            if(i>0)
            {
                  return  true;
            }
            return false;
    }

    @Override
    public boolean updateStudent() throws Exception {
         Connection con=datasource.MyCon.getConnection();
            PreparedStatement ps=con.prepareStatement("update student set nm= ? , phy= ? , chem =? , maths = ? where rno = ? ");
            ps.setInt(5, rno);
            ps.setString(1, nm);
            ps.setInt(2, phy);
            ps.setInt(3, chem);
            ps.setInt(4, maths);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                  return  true;
            }
            return false;
       
    }

    @Override
    public Student searchStudent() throws Exception
    {
         Connection con=datasource.MyCon.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from student where rno=?");
            ps.setInt(1, rno);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                Student s=new Student();
                s.setRno(rs.getInt(1));
                s.setNm(rs.getString(2));
                s.setPhy(rs.getInt(3));
                s.setChem(rs.getInt(4));
                s.setMath(rs.getInt(5));
                return  s;
            }
            return null;
    }

public     ResultSet getAllStudent()throws Exception
{
     Connection con=datasource.MyCon.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from student ");
           ResultSet rs=ps.executeQuery();
    return rs;
}
}
