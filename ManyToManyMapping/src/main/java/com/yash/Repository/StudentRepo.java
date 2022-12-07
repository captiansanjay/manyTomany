package com.yash.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yash.entity.Student;

@EnableJpaRepositories
public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student> findByStudentAddress(String city);

}
