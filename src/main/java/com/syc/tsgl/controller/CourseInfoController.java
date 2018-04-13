package com.syc.tsgl.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syc.tsgl.entity.CourseInfo;
import com.syc.tsgl.service.CourseInfoService;


@Controller
@RequestMapping(value = "/api/tsgl")
public class CourseInfoController {

	@Autowired
	@Qualifier(value = "courseInfoService")
	private CourseInfoService courseInfoService;
	

	@GetMapping(value = "/courseInfo/clazz/{courseName}")
	public String getCourseInfoCourseName(@PathVariable String courseName,HttpSession session) {
		session.setAttribute("courseName", courseName);
		List<CourseInfo> courseinfos=courseInfoService.listCourseInfosByCourseName(courseName);
		session.setAttribute("courseinfos", courseinfos);
		return "courseinfo";
	}
	
	

	@GetMapping(value = "/courseInfo/{courseInfoId}")
	public String getCourseInfoCourseName(@PathVariable Integer courseInfoId,HttpSession session) throws Exception {
		session.setAttribute("selectCourseInfoId", courseInfoId);
		String courseName=(String)session.getAttribute("courseName");
		System.out.println(courseName);
		return "redirect:/api/tsgl/courseInfo/clazz/"+courseName;
	}
	

	@ResponseBody
	@GetMapping(value = "/courseInfo/courseName")
	public Map<String,Object> getCourseInfoByCourseName(HttpSession session) throws Exception{
		Map<String, Object> map=new HashMap<>();
		List<CourseInfo> courseInfosByCourseName=courseInfoService.listCourseInfosByCourseName((String)session.getAttribute("courseName"));
		System.out.println((String)session.getAttribute("courseName"));
		map.put("courseInfosByCourseName", courseInfosByCourseName);
		return map;
	}
}
