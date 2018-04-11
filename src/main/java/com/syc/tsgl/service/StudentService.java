package com.syc.tsgl.service;

import java.util.List;

import com.syc.tsgl.entity.Student;

public interface StudentService {

	List<Student> listStudentsByClassId(Integer classId);
	
	int updateStudent(Student student);
	
	int insertStudent(Student student);
	
	Student getStudentById(String studentId);
}
