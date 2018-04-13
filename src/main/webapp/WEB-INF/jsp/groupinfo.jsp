<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<title>学生分组信息</title>
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
		<h2>学生分组信息</h2>
	</div>
	<!-- 数据展示区 -->
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>学生编号</th>
				<th>学生姓名</th>
				<th>班级</th>
				<th>专业</th>
				<th>分组情况</th>
				<th>出勤</th>
				<th>进入课堂|离开课堂</th>
			</tr>
			<tbody>
				<!-- 数据提取 -->
				<c:forEach items="${requestScope.students}" var="student" step="1">
					<tr class="info">
						<td>${student.studentid}</td>
						<td>${student.studentname}</td>
						<td>${student.clazz.classname}</td>
						<td>${student.studentmajor}</td>
						<td>${student.studentgroup}</td>
						<c:choose>
							<c:when test="${student.studentstate eq true }">
								<td>出勤</td>
							</c:when>
							<c:when test="${student.studentstate eq false }">
								<td>未出勤</td>
							</c:when>
						</c:choose>
						<td><a
							href="${ctx}/api/tsgl/student/updateState?studentId=${student.studentid}&state=1">
								进入课堂| </a>
								<a href="${ctx}/api/tsgl/student/updateState?studentId=${student.studentid}&state=0">
								退出课堂</a>
								</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>