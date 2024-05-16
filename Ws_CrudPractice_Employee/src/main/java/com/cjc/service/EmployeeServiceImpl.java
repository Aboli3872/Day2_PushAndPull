package com.cjc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepositoryI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{
	@Autowired
	EmployeeRepositoryI eri;

	@Override
	public List saveEmp(List<Employee> e) 
	{
		return eri.saveAll(e);
	}

	@Override
	public Iterable<Employee> showEmp() 
	{
		Iterable<Employee>emp=eri.findAll();
		return emp;
	}

	@Override
	public  void updateEmp(Employee e) 
	{
		eri.save(e);
		
	
	}

	@Override
	public void deleteEmp(int eid) 
	{
		eri.deleteById(eid);
		
	}

	@Override
	public Optional<Employee> getSingleEmp(int eid) 
	{
		Optional<Employee> e=eri.findById(eid);
		return e;
	}

	
	

	
	

}
