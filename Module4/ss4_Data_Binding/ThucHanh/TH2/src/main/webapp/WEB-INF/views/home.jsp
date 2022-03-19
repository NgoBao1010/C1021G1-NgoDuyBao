<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/2/2022
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

  <h3>LOGIN</h3>
  <form:form action="login" method="post" modelAttribute="login">
       <table>
           <tr>
               <td><form:label path="account">Account</form:label></td>
               <td><form:input path="account" /></td>
           </tr>
           <tr>
               <td><form:label path="password">Password</form:label></td>
               <td><form:input path="password" /></td>
           </tr>
           <tr>
               <td></td>
               <td><form:button>Login</form:button></td>
           </tr>
       </table>
  </form:form>
</body>
</html>
