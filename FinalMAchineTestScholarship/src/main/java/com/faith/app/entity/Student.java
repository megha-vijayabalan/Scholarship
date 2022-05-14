package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {	
		
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="student_id")
	private int studentId;	

	@OneToOne(mappedBy = "student")
	private Ranking ranking;
	
	@Column(name="student_name",nullable=false,length=50)
	private String studentName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, Ranking ranking, String studentName) {
		super();
		this.studentId = studentId;
		this.ranking = ranking;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", ranking=" + ranking + ", studentName=" + studentName + "]";
	}
	
	
	
	

}