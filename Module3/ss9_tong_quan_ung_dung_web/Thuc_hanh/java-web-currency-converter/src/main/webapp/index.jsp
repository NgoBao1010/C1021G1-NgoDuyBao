<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/25/2022
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h1>Currency Converter</h1>
  <form action="/convert" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="INPUT RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="INPUT USD YOU WANT TO CONVERTER" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>
  </body>
</html>
