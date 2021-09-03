<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/3/14
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>nameError</title>
</head>
<body>
<%
    request.getSession().setAttribute("tips","用户不存在");
    response.sendRedirect("./index.jsp");
%>
</body>
</html>
