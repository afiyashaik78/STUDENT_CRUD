package com.crud.student.controller;
import com.crud.student.model.Student; 
import com.crud.student.service.StudentService; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 
@RestController 
@RequestMapping("/students") 
public class StudentController { 
 
    private StudentService studentService; 
 
    public StudentController(StudentService studentService) { 
        this.studentService = studentService; 
    } 
 
    @PostMapping 
    public Student createStudent(@RequestBody Student student) { 
        return studentService.createStudent(student); 
    } 
 
    @GetMapping 
    public List<Student> getAllStudents() { 
        return studentService.getAllStudents(); 
    } 
 
    @GetMapping("/{id}") 
    public Student getStudentById(@PathVariable Long id) { 
        return studentService.getStudentById(id); 
    } 
 
    @PutMapping("/{id}") 
    public Student updateStudent(@PathVariable Long id, @RequestBody Student 
updatedStudent) { 
        return studentService.updateStudent(id, updatedStudent); 
    } 
 
    @DeleteMapping("/{id}") 
    public String deleteStudent(@PathVariable Long id) { 
        studentService.deleteStudent(id); 
        return "Student deleted successfully"; 
    } 
} 

