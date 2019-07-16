<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/6/3
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>


<%

    //在域中存储数据

    session.setAttribute("name", "张三");

    request.setAttribute("name", "李四");

    session.setAttribute("age", 13);


    request.setAttribute("str", "");


%>

<h3>
    el获取值
</h3>

${sessionScope.name}
${sessionScope.age}
${requestScope.name}
${requestScope.str}
${name}
${sessionScope.haha}
</body>
</html>
