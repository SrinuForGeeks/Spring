package com.datageeks.controller;

import com.datageeks.service.EmployeeService;

public class EmployeeController {
	
	private EmployeeService employeeServiceRef = null;
	
	

	public EmployeeController(EmployeeService employeeServiceRef) {
		super();
		this.employeeServiceRef = employeeServiceRef;
	}

	

	public void getInfo()
	{
		employeeServiceRef.getInfo();
		System.out.println(" From EmployeeController :: I implement  Presentation Logics ::");
		
	}
	
}
