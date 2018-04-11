package com.syc.tsgl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syc.tsgl.entity.Clazz;
import com.syc.tsgl.entity.CourseInfo;
import com.syc.tsgl.entity.Student;
import com.syc.tsgl.service.ClazzService;
import com.syc.tsgl.service.CourseInfoService;
import com.syc.tsgl.service.StudentService;
import com.syc.tsgl.utils.ResponseMessage;
import com.syc.tsgl.utils.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/tsgl")
@Api("课程操作Controller")
public class ClazzController {

	@Autowired
	@Qualifier(value = "clazzService")
	private ClazzService clazzService;

	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	@Autowired
	@Qualifier("courseInfoService")
	private CourseInfoService courseInfoService;

	@ApiOperation(value = "按主键查找课程信息")
	@GetMapping("/clazz/{classId}")
	public ResponseMessage<Map<String, Object>> getClazzAndCourseInfos(@PathVariable Integer classId) {
		Map<String, Object> map=new HashMap<>(16);
		List<CourseInfo> courseInfos=courseInfoService.listCourseInfosByClassId(classId);
		List<Student> students=studentService.listStudentsByClassId(classId);
		map.put("courseInfos", courseInfos);
		map.put("students", students);
		return Result.success(map);
	}

	@ApiOperation(value = "查找全部课程")
	@GetMapping("/clazz")
	public ResponseMessage<List<Clazz>> getClazzs() {
		return Result.success(clazzService.listAllClazzs());
	}
}
