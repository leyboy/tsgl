package com.syc.tsgl.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.syc.tsgl.entity.Student;
import com.syc.tsgl.service.ClazzService;
import com.syc.tsgl.service.StudentService;
import com.syc.tsgl.utils.GroupUtils;

@Controller
@RequestMapping(value = "/api/tsgl")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	@Autowired
	@Qualifier(value = "clazzService")
	private ClazzService clazzService;

	@GetMapping("/student")
	public String listAllStudents(Model model) {
		List<Student> students=studentService.listAllStudents();
		model.addAttribute("students", students);
		return "groupinfo";
	}
	
	
	@GetMapping("/student/group")
	public String listAllStudentsByGroup(Model model) {
		List<Student> students=studentService.listAllStudents();
		students=GroupUtils.changeToGroupStr(students, 2);
		//for (Student student : students) {
		//	studentService.updateStudent(student);
		//}
		model.addAttribute("students", students);
		return "groupinfo";
	}
	
	
	@GetMapping("/student/state")
	public String listAllStudentsState(Model model) {
		List<Student> students=studentService.listAllStudents();
		model.addAttribute("tmpStudents", students);
		return "studentstate";
	}
	
	
	@GetMapping("/student/updateState")
	public String updateStudentState(@RequestParam(value="state") Boolean state,@RequestParam(value="studentId") String studentId){
		if(state!=null){
			Student student=studentService.getStudentById(studentId);
			student.setStudentstate(state);
			studentService.updateStudent(student);
		}else{
			//do nothing
		}
		return "redirect:/api/tsgl/student";
	}
}
