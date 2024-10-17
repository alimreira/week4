package com.weekOne.demoWeekOneToFour.service;

import com.weekOne.demoWeekOneToFour.Entity.Student;
import com.weekOne.demoWeekOneToFour.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
        @Autowired
        private StudentRepository studentRepository;
        public Optional<Student> findById(Long id) {
                return studentRepository.findById(id);
        }

        public Student save(Student student) {
                return studentRepository.save(student);
        }

        public Student updateStudent(Long id, Student studentDetails) {
                Optional<Student> optionalStudent = studentRepository.findById(id);
                if (!optionalStudent.isPresent()) {
                        throw new RuntimeException("Student not found with id " + id);
                }

                Student existingStudent = optionalStudent.get();
                existingStudent.setName(studentDetails.getName());
                existingStudent.setAge(studentDetails.getAge());
                existingStudent.setCourse(studentDetails.getCourse());

                return studentRepository.save(existingStudent);
        }

        public void deleteById(Long id) {
                studentRepository.deleteById(id);
        }
}



