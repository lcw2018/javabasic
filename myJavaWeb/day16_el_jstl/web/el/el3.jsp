<%@ page import="com.lcw.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
Created by IntelliJ IDEA.
User: lcw2017
Date: 2019/6/3
Time: 17:49
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>

<%


    User user = new User();
    user.setName("张三");
    user.setAge(14);
    user.setBirthday(new Date());
    request.setAttribute("u", user);


    List list = new ArrayList();

    list.add("aaa");
    list.add("bbb");

    list.add("ccc");

    list.add(user);

    request.setAttribute("list", list);

    HashMap hashMap = new HashMap();


    hashMap.put("sname", "李四");
    hashMap.put("gender", "男");
    hashMap.put("user", user);

    request.setAttribute("map", hashMap);


%>

<h3>el获取对象中的值</h3>

${requestScope.u}

<%--
    * 通过的是对象的属性来获取
        * setter或getter方法，去掉set或get，再将剩余部分，首字母变为小写。
        * setName --> Name --> name
--%>


${requestScope.u.name}<br>
${u.age}<br>
${u.birthday}<br>
${u.birStr}<br>


<h3>el获取list值</h3>
${list}<br>


${list[0]}<br>

${list[1]}<br>

${list[2]}<br>
${list[10]}<br>

${list[3].name}<br>


<h3>el获取map值</h3>

${map}

${map.gender}<br>


${map["gender"]}<br>

${map.user.name}


</body>
</html>
