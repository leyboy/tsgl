package com.syc.tsgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syc.tsgl.entity.Student;
import com.syc.tsgl.service.StudentService;
import com.syc.tsgl.utils.ResponseMessage;
import com.syc.tsgl.utils.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/tsgl")
@Api("学生操作Controller")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	@ApiOperation(value = "按主键查找Student")
	@GetMapping("/student/{pkStudentId}")
	public ResponseMessage<Student> getStudentById(@PathVariable String pkStudentId) {
		return Result.success(studentService.getStudentById(pkStudentId));
	}

	@ApiOperation(value = "按课程主键查找Student列表")
	@GetMapping("/student/clazz/{classId}")
	public ResponseMessage<List<Student>> listStudentsByClassId(@PathVariable Integer classId) {
		return Result.success(studentService.listStudentsByClassId(classId));
	}
}
