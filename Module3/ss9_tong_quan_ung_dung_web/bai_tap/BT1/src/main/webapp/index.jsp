<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/10/2022
  Time: 9:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Calculator</title>
  </head>
  <body>
  <div>
    <h1 style="background-color: #ea0909">Product Discount Calculator</h1>
  </div>
  <div>
    <form action="/display-discount" method="post">
      <div>
        <label>Product Description</label>
        <textarea id="description" placeholder="Mô tả của sản phẩm" name="description"></textarea>
      </div>
      <div>
        <label>List Price</label>
        <input type="text"  id="price" placeholder="Giá niêm yết của sản phẩm" name="price">
      </div>
      <div>
        <label>Discount Percent</label>
        <input type="text" class="form-control" id="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)" name="discount">
      </div>
      <button style="background-color: blue" type="submit">Submit</button>
    </form>
  </div>
  </body>
</html>
