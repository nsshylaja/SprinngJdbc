package com.sample.jdbcapp.data;


public class Employee {
	private long Id;
	private String fName;
	private String lName;
	private String email;
	
	public Employee(){
		
	}
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}
	public String getfName() {
		return fName;
	}
	public Employee(long id, String fName, String lName, String email) {
		super();
		Id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
