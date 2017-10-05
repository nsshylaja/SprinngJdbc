package com.sample.jdbcapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.sample.jdbcapp.service.EmployeeService;
import com.sample.jdbcapp.data.Employee;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public ModelAndView getEmployees(ModelMap map){
		logger.info("in RestController getEmployees");
		List<Employee> employess = employeeService.getEmployees();
		return new ModelAndView("getEmployee","list",employess);  
		
	}
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getRestEmployees(){
		logger.info("in RestController getRestEmployee");
		List<Employee> employess = employeeService.getEmployees();
		return employess;  
		
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public @ResponseBody void addEmployee(@RequestBody Employee emp){
		logger.info("in addEmployee");
		employeeService.addEmployee(emp);
	}
	
	@RequestMapping(value = "/employee/{Id}", method = RequestMethod.DELETE)
	public @ResponseBody int deleteEmployee(@PathVariable Long Id){
		logger.info("in deleteEmployee");
		return employeeService.deleteEmployee(Id);
	}
	
	@RequestMapping(value = "/employee/{Id}", method = RequestMethod.PUT)
	public @ResponseBody int updateEmployee(@PathVariable Long Id, @RequestBody Employee emp){
		logger.info("in updateEmployee");
		return employeeService.updateEmployee(Id, emp);
	}


	

}
