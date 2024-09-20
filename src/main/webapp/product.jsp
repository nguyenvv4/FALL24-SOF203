<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 18/09/2024
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Day la trang chu</h2>
<form action="/them" method="post">
    ID <input type="text" name="id"> <br>
    Name <input type="text" name="name"> <br>
    Price <input type="text" name="price"> <br>
    Quantity <input type="text" name="quantity"> <br>
    <button type="submit">Submit</button>
</form>
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Quantity</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td><a href="/chi-tiet?id=${product.id}">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
