<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生页面</title>
<link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-theme.min.css" />
<script type="text/javascript" src="${ctx}/dwr/engine.js"></script>
<script type="text/javascript"
	src="${ctx}/dwr/interface/CourseInfoService.js"></script>
<script type="text/javascript" src="${ctx}/dwr/util.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	CourseInfoService.getCourseInfoByIdAndDwr(function(data) {
		$("#content").html(data.courseinfochaptercontent);
		$("#charapterName").html(data.courseinfochaptername);
	});
</script>
</head>
<body>
	<h1>hello world</h1>
	<div id="charapterName" align="center"></div>
	<div id="content"></div>
</body>
</html>