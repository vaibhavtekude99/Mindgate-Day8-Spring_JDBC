package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "xyz", 1000);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//	boolean result=employeeServiceInterface.adddNewEmployee(employee);
//	
//	    if(result)
//	    {
//	    	System.out.println("Employee Added successFully");
//	    }
//	    else
//	    	System.out.println("unable to add");
//	

//	List<Employee> allEmployee=employeeServiceInterface.getAllEmployee();
//	      for (Employee emp : allEmployee) {
//			System.out.println(emp);
//		}
//	      
//	  Employee employee2=employeeServiceInterface.getEmployeeByEmployeeID(21);
//	  System.out.println("_".repeat(66));
//	  System.out.println(employee2);

		Employee employee1 = new Employee(85, "Spring JDBC", 99000);
//		boolean result = employeeServiceInterface.updateEmployee(employee1);
//
//		if (result) {
//			System.out.println("Updated successFully");
//		} else
//			System.out.println("unable to Update");
		
		boolean result = employeeServiceInterface.deleteEmployee(85);

		if (result) {
			System.out.println("Deleted successFully");
		} else
			System.out.println("unable to Unable");

	}
}
