<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<title>教师页面</title>
</head>
<body>
	<div align="center">
		<h2>教师信息获取</h2>
	</div>
	<!-- 数据展示区 -->
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>教师编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
				<th>班级</th>
				<th>学院名称</th>
				<th>职称</th>
			</tr>
			<tbody>
				<!-- 数据提取 -->
				<c:forEach items="${requestScope.teachers}" var="teacher" step="1">
					<tr class="info">
						<td>${teacher.teacherid}</td>
						<td><a href="${ctx}/api/tsgl/teacherchildindex">${teacher.teachername}</a></td>
						<td>${teacher.teacherage}</td>
						<td>${teacher.sex}</td>
						<td>${teacher.clazz.classname}</td>
						<td>${teacher.college}</td>
						<td>${teacher.title}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>