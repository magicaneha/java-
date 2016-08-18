
package impl;
import java.sql.*;
import service.Student;

public interface StudentImpl
{
  public boolean insertStudent()throws Exception;
  public boolean deleteStudent()throws Exception;  
  public boolean updateStudent()throws Exception;
  public Student searchStudent()throws Exception;
  public ResultSet getAllStudent()throws Exception;
}
