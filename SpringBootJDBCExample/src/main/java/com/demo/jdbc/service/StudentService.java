package com.demo.jdbc.service;

import java.util.List;
import java.util.Optional;

import com.demo.jdbc.model.Student;

public interface StudentService {

	int save(Student student);

    int update(Student student);

    int deleteById(int id);

    List<Student> findAll();
    
    Optional<Student> findById(Long id);

}
