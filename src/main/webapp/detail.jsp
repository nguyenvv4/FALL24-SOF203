<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 20/09/2024
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Day la trang chi tiet</h2>
<form action="/cap-nhat?id=${productDetail.id}" method="post">
    Name <input type="text" name="name" value="${productDetail.name}"> <br>
    Price <input type="text" name="price" value="${productDetail.price}"> <br>
    Quantity <input type="text" name="quantity" value="${productDetail.quantity}"> <br>
    <button type="submit">Update</button>
</form>
</body>
</html>
