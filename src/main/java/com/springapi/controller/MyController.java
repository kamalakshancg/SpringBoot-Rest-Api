package com.springapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.hibernate.boot.model.source.internal.hbm.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springapi.dao.EmpRepository;
import com.springapi.entity.Employee;
import com.springapi.service.ServiceClass;


public class MyController {
    
	@Autowired
	EmpRepository empRepo;
	
	@Autowired
	ServiceClass helper;
	
	
	@GetMapping("/getdata")
	public ResponseEntity<List<Employee>> getData()
	{
		List<Employee> findAll = empRepo.findAll();
		
		if(findAll.size()==0)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		
		        
		return ResponseEntity.ok(findAll);
	}
	
	@GetMapping("/getdata/{id}")
	public ResponseEntity<Employee> getById(@PathVariable("id") int id)
	{
		Optional<Employee> findById = empRepo.findById(id);
		Employee employee = findById.get();
		if(employee==null)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.ok(employee);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addDetails(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return ResponseEntity.ok("Details added successfully");
	}
	
	
	
	
}
