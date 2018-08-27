<%@ page import="entity.Mobile" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>

<%
    Mobile mobile = (Mobile)request.getAttribute("mobile");
%>

<form action="/mobile/update" method="post">
    <div>名称：<input type="text" name="name" placeholder="name" value="<%=mobile.getName()%>"></div>
    <div>内存：<input type="text" name="storage" placeholder="storage" value="<%=mobile.getStorage()%>"></div>
    <div>尺寸：<input type="text" name="in" placeholder="in" value="<%=mobile.getIn()%>"></div>
    <div>价格：<input type="text" name="money" placeholder="money" value="<%=mobile.getMoney()%>"></div>
    <div>颜色：<input type="text" name="color" placeholder="color" value="<%=mobile.getColor()%>"></div>
    <div><input type="hidden" name="id" value="<%=mobile.getId()%>"></div>

    <div><input type="submit" value="提交更新"></div>
</form>
</body>
</html>
