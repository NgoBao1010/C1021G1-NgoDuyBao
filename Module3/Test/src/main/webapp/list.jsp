<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/23/2022
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<a class="btn btn-success" href="/product?action=create">Add new Product</a>
<form action="/product?action=search" method="post">
    <input type="text" name="name">
    <input type="submit" value="Search">
</form>

<table id="product" class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Quantity</th>
        <th scope="col">Color</th>
        <th scope="col">Category</th>
        <th scope="col">Function</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td >${product.idProduct}</td>
            <td >${product.nameProduct}</td>
            <td >${product.price}</td>
            <td >${product.quantity}</td>
            <td >${product.color}</td>
            <td >${product.nameCategory}</td>
            <td>
                <button onclick="editCustomer('${product.idProduct}')" type="button" class="btn btn-dark">Edit</button>
                <button onclick="deleteCustomer('${product.idProduct}','${product.nameProduct}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="name-product"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden  id="form-delete" action="/product?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-product">
</form>

<form hidden  id="form-edit" action="/product?action=edit">
    <input type="text" name="action" value="edit">
    <input type="text" name="id" id="editProduct">
</form>



<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

<script>
    $(document).ready(function() {
        $('#product').DataTable(
            {
                "columns": [
                    { "searchable": false },
                    null,
                    null,
                    null,
                    null
                ] }
        );
    } );
</script>
<script>
    function deleteCustomer(id, name) {
        document.getElementById("id-product").value = id;
        document.getElementById("name-product").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
    function editCustomer(id){
        document.getElementById("editProduct").value = id;
        document.getElementById("form-edit").submit();
    }

</script>
</body>
</html>
