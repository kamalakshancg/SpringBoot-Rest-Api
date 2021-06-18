package com.springapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.springapi.entity.Employee;

@Component
public interface EmpRepository extends CrudRepository<Employee, Integer>{
   
	List<Employee> findAll();
	
}
