package com.yash.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String courceName;
	private int courceBatchNo;
	@ManyToMany(mappedBy = "likedCourses")
	@JsonIgnore
	Set<Student> likes;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String courceName, int courceBatchNo, Set<Student> likes) {
		super();
		this.id = id;
		this.courceName = courceName;
		this.courceBatchNo = courceBatchNo;
		this.likes = likes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public int getCourceBatchNo() {
		return courceBatchNo;
	}

	public void setCourceBatchNo(int courceBatchNo) {
		this.courceBatchNo = courceBatchNo;
	}

	public Set<Student> getLikes() {
		return likes;
	}

	public void setLikes(Set<Student> likes) {
		this.likes = likes;
	}

}
