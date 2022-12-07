package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.Repository.StudentRepo;
import com.yash.entity.Student;

@Service
public class StudentService {
	@Autowired(required = true)
	private StudentRepo repo;

	public void saveStudentData(Student student) {
		repo.save(student);

	}

	public  List<Student> findByStudentAddress(String city) {
		// TODO Auto-generated method stub
		return repo.findByStudentAddress(city);
	}

}
