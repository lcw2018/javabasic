<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/5/28
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎登录<%=request.getSession().getAttribute("user")%>
</h1>
</body>
</html>
