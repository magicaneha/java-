package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ddetail extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String did=request.getParameter("did");
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE> Detail </TITLE></HEAD>");
		out.println("  <BODY>");
		out.println(" <h1>Feedback Form</h1> ");
		try{
			String sub=null;
			Class.forName("com.mysql.jdbc.Driver");	
			String department=request.getParameter("dept");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
     		PreparedStatement pst=con.prepareStatement("select * from feedback where dept='"+department+"'");
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				        
						String pn=rs.getString("Program Name");
						String fn=rs.getString("Faculty Name");
						String sbt=rs.getString("Subject Taught");
						String cc=rs.getString("Course Code");
						String d=rs.getString("Department");
						String b=rs.getString("Batch");
						String scm=rs.getString("Student's CGPA/Marks%");
						String pca=rs.getString("Percentage of claas Attended");
						String dt=rs.getString("Date");
						String a1=rs.getString("A1");
						String a2=rs.getString("A2");
						String a3=rs.getString("A3");
						String a4=rs.getString("A4");
						String a5=rs.getString("A5");
						String a6=rs.getString("A6");
						String a7=rs.getString("A7");
						String a8=rs.getString("A8");
						String a9=rs.getString("A9");
						String a10=rs.getString("A10");
						String b1=rs.getString("B1");
						String b2=rs.getString("B2");
						String b3=rs.getString("B3");
						String b4=rs.getString("B4");
						String b5 =rs.getString("B5");
						String c1=rs.getString("C1");
						String c2=rs.getString("C2");
						String c3=rs.getString("C3");
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
						out.println("<td>Course Code</td>");
						out.println("<td>"+cc+"</td>");
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>Department</td>");
						out.println("<td>"+d+"</td>");
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
					out.println("<a href=\"http://localhost:8084/feedback/abc\">view another branch's feedback form</a>");
			}
				
					rs.close();
					pst.close();
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
