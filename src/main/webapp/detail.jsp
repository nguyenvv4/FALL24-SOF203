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
<form action="/" method="post">
  ID <input type="text" name="id" value="${productDetail.id}"> <br>
  Name <input type="text" name="name"> <br>
  Price <input type="text" name="price"> <br>
  Quantity <input type="text" name="quantity"> <br>
  <button type="submit">Update</button>
</form>
</body>
</html>
