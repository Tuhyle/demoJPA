package com.example.demoJpa.service.ipml;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJpa.entities.student;
import com.example.demoJpa.repositories.studentRepository;
import com.example.demoJpa.service.StudentService;

@Service
public class StudentServiceIpml implements StudentService {
	@Autowired
	studentRepository studentRepository;

	@Override
	public List<student> getAllStudent() {
		List<student> list = studentRepository.findAllStudent();
		if(list.isEmpty()==false) {
			return list;
		}
		return null;
	}
	@Override
	public student findByStudentId(Integer id) {
		Optional<student> student=studentRepository.findById(id);
		return student.get();
	}
	@Override
	public void saveStudent(student student) {
		studentRepository.save(student);
	}
	@Override
	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
	}
}
