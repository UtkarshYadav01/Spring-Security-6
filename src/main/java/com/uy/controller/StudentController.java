package com.uy.controller;

import com.uy.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final List<Student> students= new ArrayList<>(List.of(
            new Student(1,"Navin", 60),
            new Student(2,"Kirna", 65)
    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("/students")
    public Student addStudents(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
