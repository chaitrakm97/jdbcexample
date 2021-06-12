package com.demo.jdbc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jdbc.model.Student;
import com.demo.jdbc.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public int save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public int update(Student student) {
		return studentRepository.update(student);
	}

	@Override
	public int deleteById(int id) {
		return studentRepository.deleteById(id);
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> findById(Long id) {
		return studentRepository.findById(id);
	}

}
