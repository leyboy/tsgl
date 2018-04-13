package com.syc.tsgl.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.syc.tsgl.entity.Clazz;
import com.syc.tsgl.service.ClazzService;
import com.syc.tsgl.service.CourseInfoService;
import com.syc.tsgl.service.StudentService;


@Controller
@RequestMapping(value = "/api/tsgl")
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

	
	@GetMapping("/clazz")
	public String getAllClazzs(Model model) {
		List<Clazz> classes=clazzService.listAllClazzs();
		System.out.println(classes);
		System.out.println(classes.get(0).getCourseInfos());
		model.addAttribute("courseInfos", classes.get(0).getCourseInfos());
		model.addAttribute("classes", classes);
		return "classinfo";
	}
}
