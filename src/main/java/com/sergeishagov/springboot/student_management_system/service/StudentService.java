package com.sergeishagov.springboot.student_management_system.service;

import com.sergeishagov.springboot.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getStudentById(Long id);

    public Student updateStudent(Student student);

    public void deleteStudentById(Long id);

}
