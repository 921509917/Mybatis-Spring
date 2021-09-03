<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String tipsAdd = (String) request.getAttribute("tipsAdd");
    request.getSession().setAttribute("tipsAdd",tipsAdd);
    String tipsDel = (String) request.getAttribute("tipsDel");
    request.getSession().setAttribute("tipsDel",tipsDel);
    String tipsAlt = (String) request.getAttribute("tipsAlt");
    request.getSession().setAttribute("tipsAlt",tipsAlt);
    response.sendRedirect("../show/change.jsp");
%>
</body>
</html>
