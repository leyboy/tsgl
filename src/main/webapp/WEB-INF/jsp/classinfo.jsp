<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<title>课程信息</title>
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
		<h2>课程信息</h2>
	</div>

	<!-- 数据展示区 -->
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>课程编号</th>
				<th>课程班级</th>
				<th>上课时间~下课时间</th>
				<th>进度</th>
				<th>学时</th>
				<th>课程资料名</th>
				<th>课程章节</th>
			</tr>
			<tbody>
				<!-- 数据提取 -->
				<c:forEach items="${requestScope.courseInfos}" var="courseInfo">
					<tr class="info">
						<c:forEach items="${requestScope.classes}" var="clazz">
							<td>${clazz.classid}</td>
							<td>${clazz.classname}</td>
							<td>${clazz.classtime}</td>
							<td>${clazz.classprogress}</td>
							<td>${clazz.classhours}</td>
						</c:forEach>
						<td><a
							href="${ctx}/api/tsgl/courseInfo/clazz/${courseInfo.courseName}">${courseInfo.courseName}</a>
						</td>
						<td>${courseInfo.courseinfochaptername}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>