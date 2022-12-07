package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.Repository.CourseRepo;
import com.yash.entity.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public void saveCourseData(Course course) {
		courseRepo.save(course);
		
	}

	public List<Course> findByCourceBatchNo(int courceBatchNo) {
		// TODO Auto-generated method stub
		return courseRepo.findByCourceBatchNo(courceBatchNo);
	}

}
