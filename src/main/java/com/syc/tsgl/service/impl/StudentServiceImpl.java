package com.syc.tsgl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syc.tsgl.dao.StudentMapper;
import com.syc.tsgl.entity.Student;
import com.syc.tsgl.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> listStudentsByClassId(Integer classId) {
		// TODO Auto-generated method stub
		return studentMapper.listStudentByClassId(classId);
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKeySelective(student);
	}

	@Override
	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.insertSelective(student);
	}

	@Override
	public Student getStudentById(String studentId) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(studentId);
	}

}
