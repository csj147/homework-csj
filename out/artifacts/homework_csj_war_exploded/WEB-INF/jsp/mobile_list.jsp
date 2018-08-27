<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>小米商城</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<%@ include file="mobile_search.jsp" %>

<form action="">
    <table class="table table-striped">
        <tr>
            <th>多选<br/><input type="checkbox" onclick="all(this)" /></th>
            <th>id</th>
            <th>名称</th>
            <th>内存</th>
            <th>尺寸</th>
            <th>价格</th>
            <th>颜色</th>
            <th>其它</th>
        </tr>

        <c:forEach var="mobile" items="${mobiles}" varStatus="st">
            <tr>
                <td><input name="id" type="checkbox" value="${mobile.id}"></td>
                <td>${mobile.id}</td>
                <td>${mobile.name}</td>
                <td>${mobile.storage}</td>
                <td>${mobile.in}</td>
                <td>${mobile.money}</td>
                <td>${mobile.color}</td>
                <td>
                    <a href="/mobile/del?id=${mobile.id}">删除</a>
                    <a href="/mobile/update?id=${mobile.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <input class="btn btn-success" type="submit" value="删除"/>
        <a class="btn btn-primary" href="/mobile/add">推出新手机</a>
    </div>
</form>

<%@ include file="Mobile_updates.jsp"%>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
