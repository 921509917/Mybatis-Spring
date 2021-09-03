<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>主界面</title>
    <!-- 引入phone.css文件 -->
    <link rel="stylesheet" href="../css/interface.css">
</head>
<body>
<div id="header">
    <span class="wel-login">欢迎进入手机管理系统</span>
</div>
<!-- 插入土图片 -->
<div id="main">
    <img src="../imgs/phone3.jpg"/>
</div>

<div id="footer">
    <a  href="change.jsp" style="color: orange;">更改操作</a><br><br>
    <a  href="show.do" style="color: orange;">查看操作</a>
</div>
</body>
</html>
