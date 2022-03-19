<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/1/2022
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Calculatoer</title>
      <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
      <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">

  </head>
  <center>
  <body>
    <h2>Calculator</h2>
    <form method="post" action="calculator">
        <table>
            <input type="text" name="value1">
            <input type="text" name="value2">
            <tr>
                <td>
                    <input type="submit" class="btn btn-primary btn-lg" name="calculation" value="+">
                    <input type="submit" class="btn btn-primary btn-lg" name="calculation" value="-">
                    <input type="submit" class="btn btn-primary btn-lg" name="calculation" value="*">
                    <input type="submit" class="btn btn-primary btn-lg" name="calculation" value="/">
                </td>
            </tr>
        </table>
    </form>

    <h2>Kết quả: ${result}</h2>

    <script src="/static/jquery/jquery-3.5.1.min.js"></script>
    <script src="/static/bootstrap413/js/popper.min.js"></script>
    <script src="/static/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="/static/bootstrap413/js/bootstrap.min.js"></script>
    <script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

  </body>
  </center>
</html>
