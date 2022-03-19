<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/1/2022
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Tiệm Bánh Mì Nhà Bảo</title>
  </head>
  <body>
    <h1>Bánh mì thêm:</h1>
    <form action="/check" method="post">
          <input type="checkbox" name="condiment"  value="Rau">
          <label>Rau</label>
          <input type="checkbox" name="condiment" value="Cà chua">
          <label>Cà Chua</label>
          <input type="checkbox" name="condiment" value="Mù tạt">
          <label>Mù Tạt</label>
          <input type="checkbox" name="condiment" value="Thịt Hộp">
          <label>Thịt hộp</label>
        <input type="checkbox" name="condiment" value="Cá Hộp">
        <label>Cá hộp</label>
        <input type="checkbox" name="condiment" value="Cá Bò">
        <label>Cá bò</label>
        <input type="checkbox" name="condiment" value="Trứng ốp la">
        <label>Trứng ốp la</label>

          <input type="submit" value="Save">
    </form>

  </body>
</html>
