<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	<table>
		<tr>
			<th colspan="2">User Login</th>
		</tr>
		<tr>
			<td>User name:</td>
			<td><input type="text" id="userName" name="userName" value="${userName }"></td>
		</tr>
			<tr>
			<td>Password</td>
			<td><input type="password" id="password" name="password" value="${password}"></td>
		</tr>
			<tr>
			<td><input type="submit" value="login"></td>
			<td><font color="red">${error}</font></td>
		</tr>
	</table>
</form>
</body>
</html>