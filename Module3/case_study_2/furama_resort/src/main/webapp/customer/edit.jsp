<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/21/2022
  Time: 4:14 PM
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
  <h1>Update Customer</h1>
  <h2>
    <a href = "/customer">List All Customers</a>
  </h2>
  <div align="center">
    <form action = "/customer?action=edit" method="post">
      <table border="1" cellpadding="5">
        <caption>
          <h2>
            Edit Customer
          </h2>
        </caption>
        <tr>
          <th>Customer Id: </th>
          <td>
            <input type="text" name="id" size="45" readonly
                   value = "<c:out value="${customer.idCustomer}"/>"/>
          </td>
        </tr>
        <tr>
          <th>Customer Name: </th>
          <td>
            <input type="text" name="name" size="45"
                   value = "<c:out value="${customer.nameCustomer}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Birthday: </th>
          <td>
            <input type="date" name="birthday" size="45"
                   value = "<c:out value="${customer.birthday}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Gender: </th>
          <td>
            <label for="gender-category">
              <select name="gender" id="gender-category">
                <option value="true" ${customer.gender = "true" ? "selected":""}/> Nam </option>
                <option value="false" ${customer.gender = "false" ? "":"selected"}/> Nữ </option>
              </select>
            </label>
          </td>
        </tr>
        <tr>
          <th>Customer Id Card: </th>
          <td>
            <input type="text" name="idCard" size="45"
                   value = "<c:out value="${customer.idCardCustomer}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Phone: </th>
          <td>
            <input type="text" pattern="(09|03|07|08)+([0-9]{8})" name="phone" size="45"
                   value = "<c:out value="${customer.phoneCustomer}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Email: </th>
          <td>
            <input type="email" name="email" size="45"
                   value = "<c:out value="${customer.emailCustomer}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Address: </th>
          <td>
            <input type="text" name="address" size="45"
                   value = "<c:out value="${customer.addressCustomer}" /> " />
          </td>
        </tr>
        <tr>
          <th>Customer Type Name: </th>
          <td>
            <select class="form-control" id="category" name="customerType">
              <c:forEach var="type" items="${customerTypeList}">
                <option value="${type.idCustomerType}">${type.nameCustomerType}</option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="Save" />
          </td>
        </tr>
      </table>
    </form>
  </div>
</center>
</body>
</html>
