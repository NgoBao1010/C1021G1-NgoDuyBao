<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/12/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<center>
<body>
    <h1>Create new product</h1>
    <p>
        <c:if test='${message != null}'>
            <span>${message}</span>
        </c:if>
    </p>
    <p>
        <a href="/products">Back to product list</a>
    </p>
    <form method="post" action="/products?action=create">
        <fieldset>
            <legend>Product Information</legend>
            <table>
                <tr>
                    <td>Name product: </td>
                    <td><input type="text" name="productname"></td>
                </tr>
                <tr>
                    <td>Price: </td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td>Description: </td>
                    <td><input type="text" name="description"></td>
                </tr>
                <tr>
                    <td>Producer: </td>
                    <td><input type="text" name="producer"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Create products"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</center>
</html>
