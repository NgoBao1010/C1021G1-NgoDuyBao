<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/21/2022
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <link rel="icon" href="/static/image/logo.png" type="image/icon type">
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<center>
  <h1>Create Customer</h1>
  <h2>
    <a href = "/customer">List All Customers</a>
  </h2>
<form method="post" action="/customer?action=create">
  <table border="1" cellpadding="5">
    <caption>
      <h2>Add New Customer</h2>
    </caption>
    <tr>
      <th>Customer Name:</th>
      <td>
        <input type="text" name="name" id="name" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Birthday:</th>
      <td>
        <input type="date" name="birthday" id="birthday" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Gender:</th>
      <td>
        <select id="gender" name="gender" required>
          <option  value="">Chọn...</option>
          <option value="true" >Nam</option>
          <option value="false" >Nữ</option>
        </select>
      </td>
    </tr>
    <tr>
      <th>ID Card:</th>
      <td>
        <input type="text" name="idCard" id="idCard" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Phone:</th>
      <td>
        <input type="text" name="phone" id="phone" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Email:</th>
      <td>
        <input type="text" name="email" id="email" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Address:</th>
      <td>
        <input type="text" name="address" id="address" size="45"/>
      </td>
    </tr>
    <tr>
      <th>Customer Type:</th>
      <td>
        <select id="idCustomerType" name="idCustomerType">
          <c:forEach var="type" items="${customerTypeList}">
            <option value="${type.idCustomerType}">${type.nameCustomerType}</option>
          </c:forEach>
        </select>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="SAVE"/>
      </td>
    </tr>
  </table>
</form>
</center>
</body>
</html>
