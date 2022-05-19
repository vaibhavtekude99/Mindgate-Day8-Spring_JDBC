package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {

	
	
	boolean adddNewEmployee(Employee employee);
            
	List<Employee> getAllEmployee();
    
    Employee getEmployeeByEmployeeID(int employeeId);
    
    boolean updateEmployee(Employee employee);
     
    boolean deleteEmployee(int employeeId);
    
    
}
