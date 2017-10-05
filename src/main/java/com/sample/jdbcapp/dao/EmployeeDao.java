package com.sample.jdbcapp.dao;

import java.util.List;

import com.sample.jdbcapp.data.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployees();
	public int addEmployee(Employee employee);
	public int deleteEmployee(Long Id);
	public int updateEmployee( Long Id, Employee employee);
}
