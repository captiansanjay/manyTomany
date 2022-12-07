package com.yash.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yash.entity.Course;

@EnableJpaRepositories
public interface CourseRepo extends JpaRepository<Course, Integer> {

	List<Course> findByCourceBatchNo(int courceBatchNo);

}
