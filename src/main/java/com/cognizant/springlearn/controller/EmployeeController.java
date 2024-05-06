package com.cognizant.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cognizant.springlearn.service.EmployeeService;

//import org.springframework.stereotype.Component;

@Controller
public class EmployeeController {
	
	
	/*public EmployeeController() {
		System.out.println("Inside EmployeeController Constructor.");
	}*/
	
	private EmployeeService employeeService;
	 
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
    	this.employeeService = employeeService;
        System.out.println("Setter method called for EmployeeService in EmployeeController");
    }

}
