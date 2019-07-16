<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/6/3
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐式对象</title>
</head>
<body>

${pageContext.request}<br>
<%--org.apache.catalina.connector.RequestFacade@4eb87272--%>
<h3>在jsp页面中动态获取虚拟目录</h3>
${pageContext.request.contextPath}<br>
<%--/day16--%>

</body>
</html>
