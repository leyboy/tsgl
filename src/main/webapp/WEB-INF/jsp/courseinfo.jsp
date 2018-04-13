<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script type="text/javascript"
	src="${ctx}/static/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript"
	src="${ctx}/static/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript"
	src="${ctx}/static/js/jquery.ztree.core.min.js"></script>
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>
			<a href="${ctx}/index.jsp">首页</a>
		</h3>
		<h3>
			<a href="${ctx}/api/tsgl/clazz">课程信息</a>
		</h3>
		<h3>
			<a href="${ctx}/api/tsgl/student/group">分组信息</a>
		</h3>
		<h3>
			<a href="${ctx}/api/tsgl/student">学生信息</a>
		</h3>
		<h3>
			<a href="${ctx}/api/tsgl/student/state">上课状态</a>
		</h3>
	</div>
	<div align="center">学生资料信息</div>

	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>课程资料Id</th>
				<th>课程资料章节</th>
				<th>课程内容</th>
			</tr>
			<tbody>
				<!-- 数据提取 -->
				<c:forEach items="${sessionScope.courseinfos}" var="courseInfo">
					<tr class="info">
						<td>${courseInfo.courseinfoid}</td>
						<td><a
							href="${ctx}/api/tsgl/courseInfo/${courseInfo.courseinfoid}">${courseInfo.courseinfochaptername}</a>
						</td>
						<td>${courseInfo.courseinfochaptercontent}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<!-- 发送ajax请求获取动态json数据构造ztree -->
	<script type="text/javascript">
		//能通过下面的url请求到json数据
		$.ajax({
			url : '${ctx}/api/tsgl/courseInfo/courseName',
			type : 'get',
			data : '',
			dataType : 'json',
			success : function(data) {
				//$.fn.zTree.init($("#ztree3"), setting, data);
				console.log(data.courseInfosByCourseName);
			}
		});
	</script>
</body>
</html>