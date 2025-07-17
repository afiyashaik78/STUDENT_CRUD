package com.crud.student.repository;
import com.crud.student.model.Student; 
import org.springframework.data.jpa.repository.JpaRepository; 
public interface StudentRepository extends JpaRepository<Student, Long> { 
}