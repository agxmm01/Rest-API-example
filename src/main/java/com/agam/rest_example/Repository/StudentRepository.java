package com.agam.rest_example.Repository;

import com.agam.rest_example.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findStudentById(int id);
}
