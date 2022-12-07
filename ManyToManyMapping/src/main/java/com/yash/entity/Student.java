package com.yash.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String studentName;
	private String studentAddress;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cource_like", 
				joinColumns = @JoinColumn(name = "student_id"), 
				inverseJoinColumns = @JoinColumn(name = "course_id"))
	Set<Course> likedCourses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String studentName, String studentAddress, Set<Course> likedCourses) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.likedCourses = likedCourses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Set<Course> getLikedCourses() {
		return likedCourses;
	}

	public void setLikedCourses(Set<Course> likedCourses) {
		this.likedCourses = likedCourses;
	}

}
