package com.springapi.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapi.entity.Employee;

@Controller
public class ControllerRequest {
   
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String displayLogin(Model model) { 
	    model.addAttribute("emp", new Employee()); 
	    return "form"; 
	}
	
	@PostMapping("/addform")
	public String addForm(@Valid @ModelAttribute("emp") Employee emp,BindingResult  result)
	{  
		System.out.println(result);
		System.out.println(emp);
		return "success";
		
	}
}
