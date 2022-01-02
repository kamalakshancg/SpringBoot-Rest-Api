package com.springapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springapi.dao.EmpRepository;
import com.springapi.entity.Employee;

@SpringBootApplication
public class SpringRestApiApplication
{

	public static void main(String[] args) 
	{  
			
		ConfigurableApplicationContext context =SpringApplication.run(SpringRestApiApplication.class, args);
		
		Employee emp1 = new Employee(103,"kamalaksha", 24000, "Tumkur");
		Employee emp2 =  new Employee(104, "kinnu", 24000,"Banglore");
		
		//List<Employee> listof = List.of(emp1,emp2);
		
		EmpRepository empRepo = context.getBean(EmpRepository.class);
		
		System.out.println("some changes made in main method");
		
		//empRepo.saveAll(listof);
		
		System.out.println("some changes made for checking build in jenkins github Hook);
		
	}
    
}
