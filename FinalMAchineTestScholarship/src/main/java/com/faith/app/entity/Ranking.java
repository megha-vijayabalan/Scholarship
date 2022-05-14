package com.faith.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ranking")
public class Ranking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationCode;
	
	@Column(name="student_id",nullable=false)
	private int studentId;

	@OneToOne
	@JoinColumn(name="student_id", insertable=false,updatable=false)
	private Student student;
	
	@Column(name="course_name",nullable=false,length=50)
	private String courseName;
	
	@Column(name="average")
	private double average;
	
	@Column(name="credit")
	private double credits;
	
	@Column(name="ranks")
	private int ranks;
	
	@Column(name="approved_date")
	private Date approvedDate;

	public Ranking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ranking(int applicationCode, int studentId, Student student, String courseName, double average,
			double credits, int ranks, Date approvedDate) {
		super();
		this.applicationCode = applicationCode;
		this.studentId = studentId;
		this.student = student;
		this.courseName = courseName;
		this.average = average;
		this.credits = credits;
		this.ranks = ranks;
		this.approvedDate = approvedDate;
	}

	public int getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(int applicationCode) {
		this.applicationCode = applicationCode;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getRanks() {
		return ranks;
	}

	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	
	
	
	
}