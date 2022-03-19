<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2022
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <link rel="icon" href="/static/image/logo.png" type="image/icon type">
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<center>
    <h1>Update Employee</h1>
    <h2>
        <a href = "/employee">List All Employee</a>
    </h2>
    <div align="center">
        <form action = "/employee?action=edit" method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit Employee
                    </h2>
                </caption>
                <tr>
                    <th>Employee Id: </th>
                    <td>
                        <input type="text" name="id" size="45" readonly
                               value = "<c:out value="${employee.idEmployee}"/>"/>
                    </td>
                </tr>
                <tr>
                    <th>Employee Name: </th>
                    <td>
                        <input type="text" name="name" size="45"
                               value = "<c:out value="${employee.nameEmployee}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Birthday: </th>
                    <td>
                        <input type="date" name="birthday" size="45"
                               value = "<c:out value="${employee.birthday}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Id Card: </th>
                    <td>
                        <input type="text" name="idCard" size="45"
                               value = "<c:out value="${employee.idCardEmployee}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Salary: </th>
                    <td>
                        <input type="text" name="salary" size="45"
                               value = "<c:out value="${employee.salary}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Phone: </th>
                    <td>
                        <input type="text" name="phone" size="45"
                               value = "<c:out value="${employee.phoneEmployee}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Email: </th>
                    <td>
                        <input type="text" name="email" size="45"
                               value = "<c:out value="${employee.emailEmployee}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Address: </th>
                    <td>
                        <input type="text" name="address" size="45"
                               value = "<c:out value="${employee.addressEmployee}" /> " />
                    </td>
                </tr>
                <tr>
                    <th>Position: </th>
                    <td>
                        <select class="form-control"  name="position">
                            <c:forEach var="type" items="${positionList}">
                                <option value="${type.idPosition}">${type.namePosition}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Education: </th>
                    <td>
                        <select class="form-control" name="education">
                            <c:forEach var="type" items="${educationList}">
                                <option value="${type.idEducation}">${type.nameEducation}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Division: </th>
                    <td>
                        <select class="form-control" name="division">
                            <c:forEach var="type" items="${divisionList}">
                                <option value="${type.idDivision}">${type.nameDivision}</option>
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
