package com.syc.tsgl.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syc.tsgl.entity.Tearcher;
import com.syc.tsgl.service.TearcherService;
@Controller
@RequestMapping(value = "/api/tsgl")
public class TearcherController {

	@Autowired
	@Qualifier("tearcherService")
	private TearcherService tearcherService;
	
	
	@GetMapping(value="/tearcher")
	public String listAllTeachers(Model model) {
		List<Tearcher> teachers=tearcherService.listAllTearchers();
		model.addAttribute("teachers", teachers);
		return "teacher";
	}
	
	
	@GetMapping(value="/teacherchildindex")
	public String toTeacherIndex(){
		return "teacherchildindex";
	}
	
}
