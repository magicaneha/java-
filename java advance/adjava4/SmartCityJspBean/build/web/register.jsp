<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 align="center">Well Come Register</h1>
        <form action="Register" method="post">
  <table width="506" border="1" align="center">
    <tr>
      <td width="179" ><strong>Name</strong></td>
      <td width="311"><input type="text"  name="un" id="un"/></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="email" id="em" name="em"/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="password" id="pw" name="pw"/></td>
    </tr>
   
    <tr>
      <td>DOB</td>
      <td><select name="dd" id="dd">
        <option>DD</option>
        <%for(int i=1;i<=31;i++){%>
        <option><%=i%></option>
                <%}%>
        </select>
        <select name="mm" id="mm">
          <option>MM</option>
           <%for(int i=1;i<=12;i++){%>
        <option><%=i%></option>
                <%}%> </select>
        <select name="yyyy" id="yyyy">
         <option>YYYY</option>
          <%for(int i=1915;i<=2014;i++){%>
        <option><%=i%></option>
                <%}%>
      </select></td>
    </tr>
    <tr>
      <td>Gender</td>
      <td>
    <p>
          <input type="radio" name="gn" id="gn" value="male" />
      MALE</p>
      <p>
      <input type="radio" name="gn" id="gn" value="female"/>
      FEMALE</p></td>
      </tr>
    <tr>
      <td>Mobno</td>
      <td><input type="number" name="mob" id="mob" /></td>
    </tr>
    <tr>
      <td>City</td>
      <td><select name="ct" id="ct">
        <option>indore</option>
        <option>delhi</option>
        <option>mumbai</option>
        <option>mandsaur</option>
        <option>chennai</option>
        <option>srinagr</option>
        <option>banglore</option>
        <option>ahemdabad</option>
        <option>pune</option>
        <option>shimla</option>
        <option>hyderabad</option>
        <option>lucknow</option>
        <option>agra</option>
        <option>dhar</option>
        <option>newyork</option>
        <option>paris</option>
        <option>losangles</option>
        <option>london</option>
        <option>switzerland</option>
      </select></td>
    </tr>
    <tr>
      <td>Address</td>
      <td><textarea name="add" id="add" cols="25" rows="3"></textarea></td>
    </tr>
    <tr>
      <td>Code</td>
      <td></td>
    </tr>
    <tr>
      <td>Click For Registration</td>
      <td><input type="submit" id="new" name="new" value="submit"/></td>
    </tr>
  </table>
  <h3 style="font:italic">* optional</h3>
</form>
    </body>
</html>
