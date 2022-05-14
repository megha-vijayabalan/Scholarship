package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Student;
@Repository
public interface IStudentRepository   extends CrudRepository<Student, Integer>{

}
