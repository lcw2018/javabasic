<%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/6/3
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
<%--
     完成数字编号对应星期几案例
         1.域中存储一数字
         2.使用choose标签取出数字         相当于switch声明
         3.使用when标签做数字判断         相当于case
         4.otherwise标签做其他情况的声明  相当于default
 --%>

<%

    request.setAttribute("number", 7);


%>


<c:choose>

    <c:when test="${number==1}"><h3>星期一</h3></c:when>
    <c:when test="${number==2}"><h3>星期二</h3></c:when>
    <c:when test="${number==3}"><h3>星期三</h3></c:when>
    <c:when test="${number==4}"><h3>星期四</h3></c:when>
    <c:when test="${number==5}"><h3>星期五</h3></c:when>
    <c:when test="${number==6}"><h3>星期六</h3></c:when>
    <c:when test="${number==7}"><h3>星期日</h3></c:when>
    <c:otherwise>输入数字有误！</c:otherwise>


</c:choose>


</body>
</html>
