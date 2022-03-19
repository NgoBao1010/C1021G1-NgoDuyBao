<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/14/2022
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<center>
<body>
    <h1>View product</h1>
    <p>
        <a href="/products">Back to product list</a>
    </p>
    <table>
        <tr>
            <td>Product Name: </td>
            <td>${product.getProductName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${product.getDescription()}</td>
        </tr>
        <tr>
            <td>Producer: </td>
            <td>${product.getProducer()}</td>
        </tr>
    </table>
</body>
</center>
</html>
