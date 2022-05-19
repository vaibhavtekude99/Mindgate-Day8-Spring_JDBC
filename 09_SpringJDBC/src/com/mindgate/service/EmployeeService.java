package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;
@Service("employeeService")//name is optional
@Scope("prototype")
public class EmployeeService  implements EmployeeServiceInterface{
 
	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;
	@Override
	public boolean adddNewEmployee(Employee employee) 
	{
		System.out.println("Inside Employee Service addNewMethod"+employee);
		return employeeDAOInterface.adddNewEmployee(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		
		return employeeDAOInterface.getAllEmployee();
	}
	@Override
	public Employee getEmployeeByEmployeeID(int employeeId) {

		return employeeDAOInterface.getEmployeeByEmployeeID(employeeId);
	}
	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDAOInterface.updateEmployee(employee);
	}
	@Override
	public boolean deleteEmployee(int employeeId) {
		return employeeDAOInterface.deleteEmployee(employeeId);
	}

}
