package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {
            
	private  int employeeId;
	private String name;
	private double saslary;
	
	@Autowired
	private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String name, double saslary, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.saslary = saslary;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaslary() {
		return saslary;
	}
	public void setSaslary(double saslary) {
		this.saslary = saslary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", saslary=" + saslary + ", address=" + address
				+ "]";
	}
	
}
