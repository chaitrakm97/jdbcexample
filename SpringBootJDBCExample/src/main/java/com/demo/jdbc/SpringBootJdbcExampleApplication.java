package com.demo.jdbc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.jdbc.model.Student;
import com.demo.jdbc.service.StudentService;

@SpringBootApplication
public class SpringBootJdbcExampleApplication implements CommandLineRunner{

	@Autowired
	StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcExampleApplication.class, args);
	}

	@Override
    public void run(String... args) {
        System.out.println("StartApplication...");
        testStudentData();
    }

    void testStudentData() {

        List<Student> students = Arrays.asList(
                new Student(1,"John", 16),
                new Student(2,"Martin", 18),
                new Student(3,"Mary",  20),
                new Student(4,"Ricky", 15)
        );

        students.forEach(student -> {
            System.out.println("Saving student with name: "+student.getStudentName() );
            studentService.save(student);
        });

        // find all
        System.out.println("get All students: "+studentService.findAll());

        // find by id
        Student student = studentService.findById(2L).orElseThrow(IllegalArgumentException::new);
        System.out.println("Student with id 2: "+student);

        // update
        student.setAge(19);
        System.out.println("Rows affected: "+studentService.update(student));

        // delete
        System.out.println("Rows affected: "+ studentService.deleteById(4));

        // find all
        System.out.println("get updated list of Students: "+studentService.findAll());

    }
}
