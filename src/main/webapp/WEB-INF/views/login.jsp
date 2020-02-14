<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>登录页面</h3>
    <form action="${cxt}/login" method="post">
        用户名：<input type="text" name="username"/><br>
        用户名：<input type="password" name="password"/><br>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>