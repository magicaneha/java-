
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%
MultipartRequest  mr=new  MultipartRequest(request, "d:/");
out.print("upload .....");
%>