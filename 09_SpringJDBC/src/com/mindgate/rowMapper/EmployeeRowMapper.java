package com.mindgate.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mindgate.pojo.Employee;

@Component("employeeRowMapper")
public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int arg1) throws SQLException {
		
	int employeeId=	resultSet.getInt("employee_Id");
	String name=resultSet.getString("name");
	double salary=resultSet.getDouble("salary");
	Employee employee=new Employee(employeeId, name, salary);
		
		  
		return employee;
	}

}
