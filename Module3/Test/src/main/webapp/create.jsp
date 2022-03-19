<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/23/2022
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<center>
    <h1>Create Product</h1>
    <h2>
        <a href = "/product">List All Product</a>
    </h2>
    <form method="post" action="/product?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Product</h2>
            </caption>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Price:</th>
                <td>
                    <input type="text" name="price" id="price" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Quantity:</th>
                <td>
                    <input type="text" name="quantity" id="quantity" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Color:</th>
                <td>
                    <input type="text" name="color" id="color" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Category:</th>
                <td>
                    <select id="idCategory" name="idCategory">
                        <c:forEach var="type" items="${categoryList}">
                            <option value="${type.idCategory}">${type.nameCategory}</option>
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
