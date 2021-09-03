<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/22
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <!-- 引入login.css文件 -->
    <link rel="stylesheet" href="css/login.css"/>
</head>
<body>
<!-- header-头部 -->
<div id="header">
    <img src="imgs/logo.jpg"/>
    <span class="line"></span>
    <span class="wel-login">欢迎登录</span>
</div>
<!-- main-主体 -->
<div id="main">
    <img src="imgs/show.jpg"/>
    <form action="some.do" method="POST" id="cForm">
        <h1>登录</h1>
        <!-- 用户名输入框 -->
        <input placeholder="请输入您的用户名" type="text" name="username" id="username" maxlength="6"/>
        <input placeholder="请输入您的密码" type="password" name="password" id="password" maxlength="6"/>
        <input type="submit" value="登 录"/>
        <h3>${tips}</h3>
        <p>没有账号吗？<a href="./regist/regist.jsp">马上注册</a></p>
    </form>
    <%request.getSession().setAttribute("tips","");%>
</div>
<!-- footer-尾部 -->
<div id="footer">
    关于我们 | 联系我们 | 人才招聘 | 商家入驻 | 营销中心 | 手机京淘 | 友情连接 | 销售联盟 | 京淘社区 | 京淘公益 | English Site<br/>
    Copyright © 2004 - 2007 京淘jingtao.com 版权所有
</div>
</body>
</html>
