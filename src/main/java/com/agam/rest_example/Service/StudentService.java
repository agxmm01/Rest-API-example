package com.agam.rest_example.Service;

import com.agam.rest_example.Model.Student;
import com.agam.rest_example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @SuppressWarnings("deprecation")
    public Student getStudentById(int id) {
        return repository.getById(id);
    }

    public ResponseEntity<HttpStatus> deleteStudentById(int id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Student> updateStudent(int id , Student student) {
        Student existingStudent = repository.findStudentById(id).orElseThrow(() ->
                new RuntimeException("No student exist with this id"));  // Use any exception for your understanding, but you need to handle it
        // as we are using Optional<T> in Repository so exception handling is must.
        existingStudent.setName(student.getName());
        existingStudent.setCourse(student.getCourse());
        repository.save(existingStudent);
        return ResponseEntity.ok().body(existingStudent);
    }
}
