package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Course;
import com.yash.entity.Student;
import com.yash.services.CourseService;
import com.yash.services.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;

	@PostMapping("/saveStudentData")
	public ResponseEntity<?> saveStudentData(@RequestBody Student student) {

		studentService.saveStudentData(student);
		return ResponseEntity.ok("success");
	}

	@PostMapping("/saveCourseData")
	public ResponseEntity<?> saveCourseData(@RequestBody Course course) {

		courseService.saveCourseData(course);
		return ResponseEntity.ok("success");
	}

	@GetMapping("/getfindByStudentAddress/{studentAddress}")
	public List<Student> findByCity(@PathVariable String studentAddress) {
		System.out.println(studentAddress);

		return studentService.findByStudentAddress(studentAddress);

	}

	@GetMapping("/getcourceBatchNo/{courceBatchNo}")
	public List<Course> findByCourceBatchNo(@PathVariable int courceBatchNo) {
		return courseService.findByCourceBatchNo(courceBatchNo);

	}

}
