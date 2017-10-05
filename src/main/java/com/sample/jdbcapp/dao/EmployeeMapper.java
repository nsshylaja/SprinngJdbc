package com.sample.jdbcapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.jdbcapp.data.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	   Employee employee = new Employee();
	   employee.setId(rs.getInt("id"));
	   employee.setfName(rs.getString("firstname"));
	   employee.setlName(rs.getString("lastname"));
	   employee.setEmail(rs.getString("email"));
      return employee;
   }

}
