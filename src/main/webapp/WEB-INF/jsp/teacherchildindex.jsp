<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
</head>
<body>
	<div align="center">
	<h3><a href="${ctx}/index.jsp">首页</a></h3>
	<h3><a href="${ctx}/api/tsgl/clazz">课程信息</a></h3>
	<h3><a href="${ctx}/api/tsgl/student/group">分组信息</a></h3>
	<h3><a href="${ctx}/api/tsgl/student">学生信息</a></h3>
	<h3><a href="${ctx}/api/tsgl/student/state">上课状态</a></h3>
	</div>
</body>
</html>