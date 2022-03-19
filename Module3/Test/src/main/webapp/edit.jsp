<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/24/2022
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>PRODUCT</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<center>
    <h1>Update Product</h1>
    <h2>
        <a href = "/product">List All Product</a>
    </h2>
    <div align="center">
        <form action = "/product?action=edit" method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit Product
                    </h2>
                </caption>
                <tr>
                    <th>Name: </th>
                    <td>
                        <input type="text" name="name" size="45"
                               value = "<c:out value="${product.nameProduct}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Price: </th>
                    <td>
                        <input type="text" name="price" size="45"
                               value = "<c:out value="${product.price}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Quantity: </th>
                    <td>
                        <input type="text" name="quantity" size="45"
                               value = "<c:out value="${product.quantity}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Color: </th>
                    <td>
                        <input type="text" name="color" size="45"
                               value = "<c:out value="${product.color}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Category: </th>
                    <td>
                        <select class="form-control" id="category" name="category">
                            <c:forEach var="type" items="${categoryList}">
                                <option value="${type.idCategory}">${type.nameCategory}</option>
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
