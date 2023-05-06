package com.example.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Model.EmployeeModel;
import com.example.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public List<EmployeeModel> getAllEmployee()
	{
		List<EmployeeModel> empList=empRepository.findAll();
		return empList;
	}

	public EmployeeModel saveEmployee(EmployeeModel m) {
		EmployeeModel obj=empRepository.save(m);
		return obj;
	}
	

}
