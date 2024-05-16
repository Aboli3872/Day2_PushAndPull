package com.cjc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeServiceI;

@RestController
public class HomeController 
{
	@Autowired
	EmployeeServiceI esi;
	
	@PostMapping("/addData")
	public List getEmp(@RequestBody List<Employee> e)
	{
		List al=esi.saveEmp(e);
		return al;
	}
	
	@GetMapping("/getData")
	public Iterable<Employee> getEmpData()
	{
		Iterable<Employee>emp=esi.showEmp();
		return emp;
	}
	
	@PutMapping("/updateData")
	public String updateEmp(@RequestBody Employee e)
	{
        esi.updateEmp(e);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id")int eid)
	{
		esi.deleteEmp(eid);
		return "Data deleted ";
		
	}
	@GetMapping("/getSingleEmp/{rollno}")
	public Optional<Employee> getSingle(@PathVariable("rollno")int eid)
	{
		Optional<Employee> e=esi.getSingleEmp(eid);
		return e;
	}
	@PatchMapping("/updateEmp")
	public String changeEmp(@RequestBody Employee e)
	{
		esi.updateEmp(e);
		return "Updated emp";
	}

}
