package com.BikkadIT.DIConstructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.DIConstructorInjection.Controller.StudentController;

@SpringBootApplication
public class DiConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiConstructorInjectionApplication.class, args);
		StudentController studentController = run.getBean(StudentController.class);
	studentController.ControllerMethod();
	}

}
