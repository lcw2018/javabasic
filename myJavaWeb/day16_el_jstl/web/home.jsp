<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/6/3
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="top.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    hello
</h1>

<%
    System.out.println("haha");


%>


<% pageContext.setAttribute("msg", "hello"); %>


<%=pageContext.getAttribute("msg")%>


</body>
</html>
