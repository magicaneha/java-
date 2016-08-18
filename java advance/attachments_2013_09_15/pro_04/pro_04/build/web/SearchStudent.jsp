

<%@page contentType="text/html" pageEncoding="UTF-8" session="false" import="model.Student"%>
<jsp:useBean class="model.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="rno"></jsp:setProperty>
<%
    HttpSession session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("login.html");
        return;
    }
%>

<%

        Student s1=s.searchStudent();
        if(s1==null)
        {
            out.print("record not found.............<a href=home.jsp>home</a>");
            return;
        }

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="0">
            
            <tr><td>Roll No</td> <td><% out.print(s1.getRno()); %></td> </tr>
            <tr><td>Name</td> <td><%= s1.getNm() %></td> </tr>
            <tr><td>Physics</td> <td><%=s1.getPhy() %></td> </tr>
            <tr><td>Chemistry</td> <td><%=s1.getChem() %></td> </tr>
            <tr><td>Maths</td> <td><%=s1.getMath() %></td> </tr>
            <tr><td>Total</td> <td><%=s1.total() %></td> </tr>
        </table>

    </body>
</html>
