package com.demo;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
	StudentService service = new StudentServiceImpl();

	Student student = null;
	student = new Student();
	student.setStudentId(201);
	student.setName("Sandeep");
	
	
	service.addStudent(student);
	
	System.out.println("End of program...");
}
}
