

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class abc extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String hid=request.getParameter("hid");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE> Detail </TITLE></HEAD>");
		out.println("  <BODY>");
		out.println(" <h1>Feedback Form</h1> ");
		out.println(hid);
                try{
			String d=null;
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");

			Statement st=con.createStatement();
			ResultSet rs1 =st.executeQuery("select department from hod where hid="+hid);
			if(rs1.next())
			{
				 d=rs1.getString("department");
			
			}
ResultSet rs2=st.executeQuery("select fname from faculty where department='"+d+"'");
if(rs2.next())
{ 
  do{
  String name=rs2.getString("fname");
			PreparedStatement pst=con.prepareStatement("select * from feedbackform where department=? and fac='"+name+"'");
                        pst.setString(1,d);
pst.setString(2,name);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				        
						String pn=rs.getString(1);
						String fn=rs.getString(2);
						String sbt=rs.getString(3);
						String cc=rs.getString(4);
						String d1=rs.getString(5);
						String b=rs.getString(6);
						String scm=rs.getString(7);
						String pca=rs.getString(8);
						String dt=rs.getString(9);
						String a1=rs.getString(10);
						String a2=rs.getString(11);
						String a3=rs.getString(12);
						String a4=rs.getString(13);
						String a5=rs.getString(14);
						String a6=rs.getString(15);
						String a7=rs.getString(16);
						String a8=rs.getString(17);
						String a9=rs.getString(18);
						String a10=rs.getString(19);
						String b1=rs.getString(20);
						String b2=rs.getString(21);
						String b3=rs.getString(22);
						String b4=rs.getString(23);
						String b5 =rs.getString(24);
						String c1=rs.getString(25);
						String c2=rs.getString(26);
						String c3=rs.getString(27);
						out.println("<table border='1'");
						out.println("<tr>");
						out.println("<td>ProgramName</td>");
						out.println("<td>"+pn+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Faculty Name</td>");
					    out.println("<td>"+fn+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Subject Taught</td>");
						out.println("<td>"+sbt+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Department</td>");
						out.println("<td>"+d+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Course Code</td>");
						out.println("<td>"+cc+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Batch</td>");
						out.println("<td>"+b+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Student's CGPA/Marks%</td>");
						out.println("<td>"+scm+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Percentage of Class Attended</td>");
						out.println("<td>"+pca+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Date</td>");
						out.println("<td>"+dt+"</td>");						
						out.println("</tr>");
						out.println("</table>");
						out.println("<table>");
						out.println("<tr><td>SECTION A<hr></hr></td></tr><hr></hr>");
						out.println("<tr>");
						out.println("<td>01.Ability to bring conceptual clarity & peromotion of thinking ability by teacher</td>");
						out.println("<td>"+a1+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>02.Motivation provided</td>");
						out.println("<td>"+a2+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>03.Teacher's<communication skills/td>");
						out.println("<td>"+a3+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>04.Teacher's regularity & punchuality</td>");
						out.println("<td>"+a4+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>05.Teacher's subject knowledge</td>");
						out.println("<td>"+a5+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>06.Completion and coverage of course</td>");
						out.println("<td>"+a6+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>07.Complements theory with practical example</td>");
						out.println("<td>"+a7+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>08.Teacher's interaction and guidance outside the classrooom</td>");
						out.println("<td>"+a8+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>09.Teacher's computer or IT skills(if applicable)</td>");
						out.println("<td>"+a9+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>10.Teacher's overoll performance</td>");
						out.println("<td>"+a10+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("</table>");
						out.println("<table>");
						out.println("<hr></hr><tr><td>SECTION B</td></tr><bt><hr></hr>");
						out.println("<td>1.Result of test declared within two weeks of it being conducted</td>");
						out.println("<td>"+b1+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>2.Adequate number of assignments/class given</td>");
						out.println("<td>"+b2+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>3.Would you recommend him/her to teach the same subject to your juniors?</td>");
						out.println("<td>"+b3+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>4.Would you recommend him/her to teach you any other subject?</td>");
						out.println("<td>"+b4+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>5.In your opinion is this syllabus adequate?</td>");
						out.println("<td>"+b5+"</td>");						
						out.println("</tr>");
						out.println("</table>");
						out.println("<table>");
						out.println("<hr></hr><tr><td>SECTION C</td></tr><hr></hr>");
						out.println("<tr>");
						out.println("<td>a.What are the strengtha of the teacher</td>");
						out.println("<td>"+c1+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>b.What are the aeras of weekness in teacher</td>");
						out.println("<td>"+c2+"</td>");						
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>c.Any other suggetion(regarding curiculum,subjects/(s),faculty)</td>");
						out.println("<td>"+c3+"</td>");						
						out.println("</tr>");
				out.println("</table>");
				rs.close();	
				 pst.close();
			}		
	
}while(rs2.next());
	
}

              rs1.close();
              rs2.close();	
			  con.close();
		}catch (Exception e) {		
			out.println("Error "+e);
		}	
	
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
