<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>First_Page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<h3 aligin="center">添加用户</h3>
	<form action="user/user!add">
		<table aligin="center">
			<tr>
				<td>用户名<input type="text" name="username"></td>
			</tr>
		<tr>
				<td>密码<input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="增加"></td>
			</tr>
			
		</table>
	</form>
	<form action="user/user!update">
		<table aligin="center">
			<tr>
				<td>用户名id<input type="text" name="ID"></td>
			</tr>
		<tr>
				<td>密码<input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
			</tr>
			
		</table>
	</form>
	<form action="user/user!delete">
		<table aligin="center">
			<tr> 
				<td>用户id<input type="text" name="ID"></td>
			</tr>
			<tr>
				<td><input type="submit" value="删除"></td>
			</tr>
			
		</table>
	</form>
	<h3 aligin="center">查询所有用户</h3>
	<p aligin="center"><a href="user/user!get">查询</a></p>
  </body>
</html>
