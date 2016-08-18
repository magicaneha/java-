<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>

<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>User</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stylesheet.css"
              type="text/css"/>
    </head>
    <body>
        <h1 align="center">Well Come Login</h1>
        <form action="checkLogin.jsp" method="post">
        <table align="center">
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="em"  id="em" value="" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pw" id="pw" value="" /></td>
                </tr>
                <tr>
                    <td>Type</td>
                    <td><select name="ty" id="ty" class="myc">
                           <%
                           Connection con=mycon.MyCon.getCon();
                           Statement st=con.createStatement();
                           ResultSet rs=st.executeQuery("select distinct type from login");
                              ArrayList list=new ArrayList();
                              while(rs.next()){
                                  list.add(rs.getString(1));
                              }
                           //con.close();
                         Iterator i=list.iterator();                                                    
                             while(i.hasNext()){
                               %>
                               <option><%=i.next()%></option>    
                               
                               <%}%>
                        </select></td>
                </tr>
                <tr>
                    <td><a href="register.jsp">Sign Up</a></td>
                    <td><input type="submit" value="Login" class="myc"/>Remember Me<input type="checkbox" name="cb" value="ON" /></td>
                </tr>
           </table>
            <%
            String msg=(String)session.getAttribute("msg");
            if(msg!=null){
                out.println(msg);
                session.setAttribute("msg",null);
            }
              %>
        </form>
    </body>
</html>
