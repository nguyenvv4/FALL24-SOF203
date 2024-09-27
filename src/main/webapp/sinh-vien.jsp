<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 25/09/2024
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sinh-vien/add" method="post">
    <label >id</label>
    <input type="text" name="id"> <br>
    <label >ho ten</label>
    <input type="text" name="hoTen"><br>
    <label >dia chi</label>
    <input type="text" name="diaChi"><br>
    <label>lop</label>
    <select name="lop" id="">
        <option value="SD1801">SD1801</option>
        <option value="SD1802">SD1802</option>
        <option value="SD1803">SD1803</option>
    </select> <br>
    <label >trang thai</label>
    <input type="radio" name="trangThai" value="active">active
    <input type="radio" name="trangThai" value="inactive"> inactive
    <br>
    <button type="submit">Add</button>
</form>
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>ho ten</td>
        <td>dia chi</td>
        <td>lop</td>
        <td>trang thai</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sinhVien">
        <tr>
            <td>${sinhVien.id}</td>
            <td>${sinhVien.hoTen}</td>
            <td>${sinhVien.diaChi}</td>
            <td>${sinhVien.lop}</td>
            <td>${sinhVien.trangThai}</td>
            <td><a href="/sinh-vien/detail?id=${sinhVien.id}">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
