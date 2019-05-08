package com.example.springflywaydemo.resources;

import com.example.springflywaydemo.models.Student;
import com.example.springflywaydemo.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping Iterable<Student> getALlStudent() {
        return studentService.getAllStudents();
    }
}
