package com.BikkadIT.DIConstructorInjection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DIConstructorInjection.Dao.StudentDao;

@Service
public class StudentService {

	private StudentDao studentDao;
	
	
	
	@Autowired
	public StudentService(StudentDao studentDao) {
		super();
		
		System.out.println("Service Constructor");
		this.studentDao = studentDao;
	}




	public void ServiceMethod() {
		
		
		System.out.println("Service Method");
		
		studentDao.DaoMethod();
	}
	
}
