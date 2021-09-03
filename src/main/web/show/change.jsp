<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>更改操作</title>
    <!-- 引入phone.css文件 -->
    <link rel="stylesheet" href="../css/change.css">
</head>
<body>
<div id="header">更改操作界面</div>
<!-- 新增 -->
<div id="main">
    <form action="insertInfo.do" method="post">
        <input type="text" name="id" placeholder="编号" maxlength="5">&nbsp;
        <input type="text" name="brand" placeholder="品牌">&nbsp;
        <input type="text" name="memory" placeholder="内存">&nbsp;
        <input type="text" name="color" placeholder="颜色">&nbsp;
        <input type="text" name="price" placeholder="价格" maxlength="5">&nbsp;&nbsp;
        <input type="submit" value="新增" >
        <h4>${tipsAdd}</h4>
    </form>
    <!-- 删除 -->
    <form action="delInfo.do" method="post">
        <input type="text" name="id" placeholder="编号" maxlength="5">&nbsp;
        <input type="text" name="brand" placeholder="品牌">&nbsp;
        <input type="text" name="memory" placeholder="内存">&nbsp;
        <input type="text" name="color" placeholder="颜色">&nbsp;
        <input type="text" name="price" placeholder="价格" maxlength="5">&nbsp;&nbsp;
        <input type="submit" value="删除">
        <h4>${tipsDel}</h4>
    </form>
    <!-- 修改 -->
    <form action="alterInfo.do" method="POST">
        <input type="text" name="id" placeholder="编号" maxlength="5">&nbsp;
        <input type="text" name="brand" placeholder="品牌">&nbsp;
        <input type="text" name="memory" placeholder="内存">&nbsp;
        <input type="text" name="color" placeholder="颜色">&nbsp;
        <input type="text" name="price" placeholder="价格" maxlength="5">&nbsp;&nbsp;&nbsp;
        <input type="submit" value="修改">
        <h4>${tipsAlt}</h4>
    </form>
</div>
    <div id="footer">
        <a href="interface.jsp" style="color: orange;">主界面</a>
        <br><br>
        <a href="show.do" style="color: orange;">查看操作</a>
    </div>
    <%
        request.getSession().setAttribute("tipsAdd","");
        request.getSession().setAttribute("tipsDel","");
        request.getSession().setAttribute("tipsAlt","");
    %>
</body>
</html>