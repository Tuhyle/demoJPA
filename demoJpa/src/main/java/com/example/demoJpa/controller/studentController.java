package com.example.demoJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoJpa.entities.student;

import com.example.demoJpa.service.StudentService;


@Controller
public class studentController {


	@Autowired 
	StudentService studentService;
	@GetMapping(value="/student")
	public String student(final Model model) {

		List<student> studentList = studentService.getAllStudent();
		model.addAttribute("student",studentList);
		return "student";
	}
	//view sua
	@GetMapping(value="/edit/studentId")
	public String findByStudentId(final Model model, @RequestParam Integer id) {
//		Khoi tao Object Student
		student student = studentService.findByStudentId(id);
		model.addAttribute("student", student);
		return "edit";
	}
	//luu database sau khi sua va them
	@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") student student, BindingResult result) {
		if(result.hasErrors()==false) {
			studentService.saveStudent(student);
			return "redirect:/student";
		}
		return null;
	}
	//view database 
	@GetMapping(value="/view/id={id}")
	public String viewStudent(@PathVariable Integer id, Model model,student student ) {
		student = studentService.findByStudentId(id);
		model.addAttribute("student", student);
		return "view";
	}
//	add student
	@GetMapping(value="/addStudent")
	public String addStudent(Model model) {
		student student = new student();
		model.addAttribute("student", student);
		return "add";
		
	}
//	delete student
	@GetMapping(value="/delete/studentId")
	public String deleteById(final Model model, @RequestParam Integer id) {
//		Khoi tao Object Student
		studentService.deleteById(id);
		return "redirect:/student";
	}
}
