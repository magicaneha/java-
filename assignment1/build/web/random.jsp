


<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Esp Page</title>
    </head>
    <body>
   
       <%
       Random r= new Random();
     
   int s=  r.nextInt();
  
   out.println("random no." +s);
%>
<center>

</center>
    </body>
</html>
