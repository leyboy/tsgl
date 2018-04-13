<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<title>首页</title>
</head>
<body>
	<div align="center">
		<h1>首页</h1>
		<img alt="#" src="${ctx}/static/images/timg.jpg"> <br> <a
			href="${ctx}/api/tsgl/tearcher">教师界面</a> <a href="#">课程信息</a> <a
			href="#">分组信息</a> <a href="#">上课状态</a> <a
			href="${ctx}/student.jsp">学生界面</a>
	</div>
</body>
</html>