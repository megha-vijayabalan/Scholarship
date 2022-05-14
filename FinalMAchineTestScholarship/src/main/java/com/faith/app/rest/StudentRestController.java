package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Student;
import com.faith.app.service.IStudentService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	private IStudentService studentSerive;
	
	//Get all Employees
		@GetMapping("/students")
		public List<Student> getAllStudents(){
			
			return studentSerive.getAllStudents();
			
		}

}
