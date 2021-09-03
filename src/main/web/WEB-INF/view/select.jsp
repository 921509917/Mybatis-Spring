<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>信息展示</title>
    <!-- 引入phone.css文件 -->
    <c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
    <link rel="stylesheet" href="${path}/css/select.css">
</head>
<body>
<div id="header">手机信息界面</div>
<div id="main">
    <table border=1>
        <tr><td>编号</td><td>品牌</td><td>内存</td><td>颜色</td><td>价格</td></tr>
        <c:forEach items="${phoneList}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.brand}</td>
                <td>${list.memory}</td>
                <td>${list.color}</td>
                <td>${list.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<div id="footer">
    <a  href="/mp/show/change.jsp" style="color: orange;">更改操作</a><br><br>
    <a  href="/mp/show/interface.jsp" style="color: orange;">主界面</a>
</div>
</body>
</html>
