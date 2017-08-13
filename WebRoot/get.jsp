<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'get.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	

  </head>
  
  <body bgcolor="#33cc99">
   	<h3 aligin="center">用户列表</h3>
   	<table aligin="center">
		<tr>
			<td>ID</td>
			<td>用户名</td>
			<td>密码</td>
		</tr>	
		
		<s:iterator value="users">
		<tr>
			<td> <s:property value="id"/>  </td>
			<td> <s:property value="username"/>  </td>
			<td> <s:property value="password"/>  </td>
			
		</tr>
		</s:iterator> 	
   	</table>
  </body>
</html>
