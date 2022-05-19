package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeDAOInterface {

	
	public  static int a=45;
	boolean adddNewEmployee(Employee employee);
    List<Employee> getAllEmployee();
    
    Employee getEmployeeByEmployeeID(int employeeId);
    
    boolean updateEmployee(Employee employee);
    
    boolean deleteEmployee(int employeeId);
}
