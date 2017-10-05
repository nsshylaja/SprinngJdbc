package com.sample.jdbcapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.jdbcapp.controller.RestController;
import com.sample.jdbcapp.dao.EmployeeDao;
import com.sample.jdbcapp.data.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	@Autowired
    private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees(){
		logger.info("in EmployeeServiceImpl getEmployees");
		return employeeDao.getEmployees();
	}
	
	@Override
	public int addEmployee(Employee employee){
		logger.info("in EmployeeServiceImpl addEmployee");
		return employeeDao.addEmployee(employee);
	}
	
	@Override
	public int deleteEmployee(Long Id){
		logger.info("in EmployeeServiceImpl deleteEmployee");
		return employeeDao.deleteEmployee(Id);
	}
	
	@Override
	public int updateEmployee(Long Id, Employee employee){
		logger.info("in EmployeeServiceImpl updateEmployee");
		return employeeDao.updateEmployee(Id, employee);
	}

}
