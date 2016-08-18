

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@page import="model.Student" %>
<jsp:useBean class="model.Student" id="s" ></jsp:useBean>
<jsp:setProperty name="s" property="*" ></jsp:setProperty>
    <%
    HttpSession session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("login.html");
        return;
    }
    String lavel=session.getAttribute("lavel").toString();
        if(!lavel.equals("admin"))
        {
            response.sendRedirect("home.jsp");
            return;
        }
%>
<%
/*
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

            out.print("Record inserted.............<a href=home.jsp>home</a>");

%>