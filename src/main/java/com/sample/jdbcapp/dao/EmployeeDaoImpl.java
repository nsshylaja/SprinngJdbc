package com.sample.jdbcapp.dao;

import java.util.List;


import com.sample.jdbcapp.data.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;  
	
	
	public List<Employee> getEmployees(){
		logger.info("in EmployeeDaoImpl getEmployees");
		String SQL = "select * from EMPLOYEE";
		List <Employee> employee = jdbcTemplate.query(SQL, new EmployeeMapper());

	      return employee;

		
	}
	
	@Override
	public int addEmployee(Employee employee)  {
		String SQL = "insert into employee (firstname, lastname, email) values (?, ?, ?)";
		 logger.info("in EmployeeDaoImpl addEmployee success ");
		 return jdbcTemplate.update( SQL, employee.getfName(), employee.getlName(), employee.getEmail());

	}
	
	public int deleteEmployee(Long Id)  {
		String SQL = "delete from employee where Id="+Id+"";
		 logger.info("in EmployeeDaoImpl deleteEmployee success "+ Id);
		 return jdbcTemplate.update( SQL);

	}

	public int updateEmployee(Long Id, Employee employee)  {
		String SQL = "update employee set firstname='"+employee.getfName()+"', lastname='"+employee.getlName()+"',  email='"+employee.getEmail()+"' where id="+Id+"";
		 logger.info("in EmployeeDaoImpl updateEmployee success ");
		 return jdbcTemplate.update( SQL);

	}

	

}
