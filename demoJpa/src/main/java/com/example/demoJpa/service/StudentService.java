package com.example.demoJpa.service;

import java.util.List;

import com.example.demoJpa.entities.student;

public interface StudentService {
 List<student> getAllStudent();
 student findByStudentId(Integer id);
 void saveStudent(student student);
 void deleteById(Integer id);
}
