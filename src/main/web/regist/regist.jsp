<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/22
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8"/>
    <!-- 引入login.css文件 -->
    <link rel="stylesheet" href="../css/regist.css"/>
</head>
<body>
<!-- header-头部 -->
<div id="header">
    <img src="../imgs/logo.jpg"/>
    <span class="line"></span>
    <span class="wel-login">欢迎注册</span>
</div>
<!-- main-主体 -->
<div id="main">
    <img src="../imgs/show.jpg"/>
    <form action="regist.do" method="POST">
        <h1>注册</h1>
        <!-- 注册框 -->
        <input placeholder="请输入您的用户名" type="text" name="username" id="usernameusername" maxlength="6"/>
        <label>(长度为6)</label>
        <input placeholder="请输入您的密码" type="password" name="password" id="password" maxlength="6"/>
        <label>(长度为6)</label>
        <input type="submit" value="注 册"/>
        <h3>${tips}</h3>
        <p>已有账号？<a href="../index.jsp">去登录</a></p>
    </form>
    <%request.getSession().setAttribute("tips","");%>
</div>

<!-- footer-尾部 -->
<div id="footer">
    关于我们 | 联系我们 | 人才招聘 | 商家入驻 | 营销中心 | 手机京淘 | 友情连接 | 销售联盟 | 京淘社区 | 京淘公益 | English Site<br/>
    Copyright © 2004 - 2007 京淘8小组.com 版权所有
</div>
</body>
</html>
