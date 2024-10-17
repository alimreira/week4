package com.weekOne.demoWeekOneToFour.controller;

import com.weekOne.demoWeekOneToFour.Entity.Student;
import com.weekOne.demoWeekOneToFour.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    //This endpoint is use to create a new student.
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    //Fetches a specific student based on their ID.
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return studentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Updates details of an existing student.
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        if (!studentService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        student.setId(id);
        return ResponseEntity.ok(studentService.save(student));
    }

    //Deletes a specific student based on their ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        if (!studentService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        studentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

