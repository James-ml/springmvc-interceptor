<%@ page import="cn.jims.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Jims
  Date: 2017/1/31
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
  <form name="f" action="query" method="post">
    用户名：<input type="text" name="name"><br>
    密&nbsp;码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
  </form>
  </body>
</html>
