<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/5/23
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>


<%

    System.out.println("hello jsp!");

    String contextPath = request.getContextPath();
    out.write(contextPath);
%>


<%
    int i = 3;

%>


<%="hello jsp"%>

<br>
System.out.println("hello jsp!");




<% response.getWriter().write("hello index.jsp");%>

<% response.getWriter().print("hello index");%>
</body>
</html>
