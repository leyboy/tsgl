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
	<div align="center">
		<h2>上课状态获取</h2>
	</div>
	<!-- 数据展示区 -->
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>学生编号</th>
				<th>学生姓名</th>
				<th>班级</th>
				<th>专业</th>
				<th>听讲状态</th>
			</tr>
			<tbody>
				<!-- 数据提取 -->
				<c:forEach items="${requestScope.tmpStudents}" var="student"
					step="1">
					<tr class="info">
						<td>${student.studentid}</td>
						<td>${student.studentname}</td>
						<td>${student.clazz.classname}</td>
						<td>${student.studentmajor}</td>
						<c:choose>
							<c:when test="${student.studentstate eq true }">
								<td>听讲</td>
							</c:when>
							<c:when test="${student.studentstate eq false }">
								<td>走神</td>
							</c:when>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>