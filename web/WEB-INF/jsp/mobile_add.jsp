<%--
  Created by IntelliJ IDEA.
  User: 陈小子
  Date: 2018/8/27
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>

<form action="/mobile/add" method="post">
    <div>id：<input name="id" type="text" placeholder="id" /></div>
    <div>名称：<input name="name" type="text" placeholder="name" /></div>
    <div>内存：<input name="storage" type="text" placeholder="storage" /></div>
    <div>尺寸：<input name="in" type="text" placeholder="in" /></div>
    <div>价格：<input name="money" type="text" placeholder="money" /></div>
    <div>颜色：<input name="color" type="text" placeholder="color" /></div>

    <div><button type="submit">添加</button></div>
</form>

</body>
</html>
