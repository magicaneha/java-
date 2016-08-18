package pack;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		response.setContentType("text/html");
		try{
		PrintWriter out=response.getWriter();
				
		Class.forName("com.mysql.jdbc.Driver");
	    out.println("Driver Loaded");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb11","root","root");
		out.println("connected");
		String uid=request.getParameter("uid");
	    String name =request.getParameter("nm");
		String passsword=request.getParameter("pwd");
		String address = request.getParameter("address");
		String gender=request.getParameter("gender");
		String city=request.getParameter("City");
		String mobno=request.getParameter("mn");
		String course=request.getParameter("course");
		String h1=request.getParameter("d");
		String h2=request.getParameter("p");
		String h3=request.getParameter("cr");
		String h4=request.getParameter("ch");
		String h5=request.getParameter("o");
		String hq=request.getParameter("Que");
		String ha=request.getParameter("ans");
		
		PreparedStatement pst=con.prepareStatement("insert into myprofile(uid,name,password,address,gender,city,mobno,course,hobbies,hq,ha)values(???????????)");
		pst.setString(1,"uid");
		pst.setString(2,"name");
		pst.setString(3,"password");
		pst.setString(4,"address");
		pst.setString(5,"gender");
		pst.setString(6,"city");
		pst.setString(7,"mobno");
		pst.setString(8,"course");
		pst.setString(9,"h1");
		pst.setString(9,"h2");
		pst.setString(9,"h3");
		pst.setString(9,"h4");
		pst.setString(9,"h5");
		pst.setString(10,"hq");
		pst.setString(11,"ha");
		int r=pst.executeUpdate();
		if(r!=0)
		out.println("insertion success");
		else
			out.println("insertion fail");
		con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not found");
		}
		catch(SQLException e)
		{
		System.out.println("SQL Error");
		}
	}

}