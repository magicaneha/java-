
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="rno"></jsp:setProperty>
<%@page  import="service.Student" %>
<%@include file="check.jsp" %>
<%
    String s2=session.getAttribute("lavel").toString();
    if(!s2.equals("admin"))
    {
        response.sendRedirect("home.jsp");
        return;
    }

%>

<%
Student s1=s.searchStudent();
if(s1==null)
{
    out.print("Record not found..........<a href=home.jsp>home</a>");
    return; 
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ModifyStudent.jsp">
  
       <table border="0" align="center">

           <tr><td>Roll No</td><td><input type="text" name="rno" readonly="true"  value=<%=s1.getRno() %> ></td></tr>
           <tr><td>Name</td><td><input type="text" name="nm" value=<%=s1.getNm() %> ></td></tr>
           <tr><td>Physics</td><td><input type="text" name="phy" value=<%=s1.getPhy()%> ></td></tr>
           <tr><td>Chemistry</td><td><input type="text" name="chem" value=<%=s1.getChem() %>  ></td></tr>
           <tr><td>Maths</td><td><input type="text" name="math"  value=<%=s1.getMath() %> ></td></tr>
           <tr><td colspan="2" align="center"><input type="submit" value="modify" name="modify" /></td></tr>

        </table>
                  </form>
    </body>
</html>
