package com.BikkadIT.DIConstructorInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DIConstructorInjection.Service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;
	
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		
		System.out.println("Controller Constructor");
		this.studentService = studentService;
	}




	public void ControllerMethod() {
		
		System.out.println("Controller Method");
		studentService.ServiceMethod();
	}
	
}
