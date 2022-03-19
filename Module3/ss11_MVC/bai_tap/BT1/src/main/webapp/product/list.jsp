<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/12/2022
  Time: 8:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<style>
    span{
        text-align: right;
    }
</style>
<center>
<body>
    <h1>Product</h1>
    <p>
        <a href="/products?action=create">Create New Product</a>
    </p>
    <form method="post" action="/products?action=search">
        <input type="text" name="search">
        <input type="submit" value="Search">
    </form>
    <table border="1">
        <tr>
            <td>Tên sản phẩm</td>
            <td>Giá</td>
            <td>Mô tả</td>
            <td>Nhà sản xuất</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach  var="product" items='${requestScope["productList"]}'>
            <tr>
                <td><a href="/products?action=view&id=${product.getId()}">${product.getProductName()}</a></td>
                <td>${product.getPrice()}</td>
                <td>${product.getDescription()}</td>
                <td>${product.getProducer()}</td>
                <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
                <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</center>
</html>
