<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="service.Student" %>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="*"></jsp:setProperty>
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
/*
 *
String rno=request.getParameter("rno");
String nm=request.getParameter("nm");
String phy=request.getParameter("phy");
String chem=request.getParameter("chem");
String math=request.getParameter("math");

Student s=new Student();

s.setRno(Integer.parseInt(rno));
s.setNm(nm);
s.setPhy(Integer.parseInt(phy));
s.setChem(Integer.parseInt(chem));
s.setMath(Integer.parseInt(math));

*/
if(s.insertStudent())
  {
    out.print("Record insertd......<a href=home.jsp>home</a>");
}
                
                %>

