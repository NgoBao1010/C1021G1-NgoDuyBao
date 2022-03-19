<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/14/2022
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<center>
<body>
    <h1>Delete Product</h1>
    <p>
        <a href="/products">Back to product list</a>
    </p>
    <form method="post" action="/products?action=delete">
        <h3>Do you want delete?</h3>
        <fieldset>
            <legend>Product Information</legend>
            <table>
                <tr>
                    <td>Id: </td>
                    <td><input type="text" name="id" readonly value="${product.getId()}"></td>
                </tr>
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
                <tr>
                    <td><input type="submit" value="Delete"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</center>
</html>
