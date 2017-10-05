package com.sample.jdbcapp.service;

import java.util.List;

import com.sample.jdbcapp.data.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public int addEmployee(Employee employee);
	public int deleteEmployee(Long Id);
	public int updateEmployee( Long Id, Employee employee);

}
