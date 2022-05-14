package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IStudentRepository;
import com.faith.app.entity.Student;

@Service
public class StuentServiceImple implements IStudentService {
	
	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		 
		return (List<Student>) studentRepo.findAll();
	}

}
