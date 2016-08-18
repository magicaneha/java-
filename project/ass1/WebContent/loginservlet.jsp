<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("nm");
String pass=request.getParameter("pw");
if(name.equals("abc") && pass.equals("123")){
	out.println("Login successful");
	out.println("Welcome  " + name);
}
else{
	out.println("Login UNsuccessful");
}
%>


</body>
</html>