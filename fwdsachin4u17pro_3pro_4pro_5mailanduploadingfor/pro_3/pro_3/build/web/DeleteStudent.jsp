
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
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
    if(s.deleteStudent())
        out.print("Record Deleted...............<a href=home.jsp>home</a>");
    else
        out.print("Record not found...............<a href=home.jsp>home</a>");


%>