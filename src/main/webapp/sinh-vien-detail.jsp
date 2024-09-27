<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 25/09/2024
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sinh-vien/add" method="post">
    <label>id</label>
    <input type="text" name="id" value="${sinhVien.id}"> <br>
    <label>ho ten</label>
    <input type="text" name="hoTen"value="${sinhVien.hoTen}"><br>
    <label>dia chi</label>
    <input type="text" name="diaChi"value="${sinhVien.diaChi}"><br>
    <label>lop</label>
    <select name="lop" id="">
        <option value="SD1801">SD1801</option>
        <option value="SD1802">SD1802</option>
        <option value="SD1803">SD1803</option>
    </select> <br>
    <label>trang thai</label>
    <input type="radio" name="trangThai" value="active" ${sinhVien.trangThai == 'active' ? 'checked': ''}>active
    <input type="radio" name="trangThai" value="inactive"${sinhVien.trangThai == 'inactive' ? 'checked': ''}> inactive
    <br>
    <button type="submit">Add</button>
</form>
</body>
</html>
