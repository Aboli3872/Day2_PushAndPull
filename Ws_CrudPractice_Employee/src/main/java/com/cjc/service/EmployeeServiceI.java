package com.cjc.service;

import java.util.List;
import java.util.Optional;

import com.cjc.model.Employee;

public interface EmployeeServiceI 
{

public List saveEmp(List<Employee> e);

public Iterable<Employee> showEmp();

public void updateEmp(Employee e);

public void deleteEmp(int eid);

public Optional<Employee> getSingleEmp(int eid);


}
