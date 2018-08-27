<%--
  Created by IntelliJ IDEA.
  User: 陈小子
  Date: 2018/8/27
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询页面</title>
</head>
<body>

<form action="/mobile/s" method="post">
    <table class="table table-hover table-dark">
        <thead>
        <tr>
            <th scope="col"><h3>小米商城</h3></th>
            <th scope="col">
                <input name="name" type="text" placeholder="根据手机名称查询"/>
                <button type="submit" class="btn btn-dark">查询</button>
            </th>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
