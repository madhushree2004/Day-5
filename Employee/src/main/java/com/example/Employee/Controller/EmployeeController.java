package com.example.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Model.EmployeeModel;
import com.example.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping(value="/")
	public List<EmployeeModel> getAllEmployee()
	{
		List<EmployeeModel> empList=empService.getAllEmployee();
		return empList;
	}
	
	@PostMapping(value="/saveEmployee")
	public EmployeeModel saveEmployee(@RequestBody EmployeeModel m)
	{
		return empService.saveEmployee(m);
	}
	
	@PutMapping(value="/k")
	public EmployeeModel k(@RequestBody EmployeeModel m)
	{
		return empService.saveEmployee(m);
	}

}
