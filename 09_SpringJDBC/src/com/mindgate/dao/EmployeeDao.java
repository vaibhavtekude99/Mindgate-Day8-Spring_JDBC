package com.mindgate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.rowMapper.EmployeeRowMapper;

@Repository("employeeDao")
@Scope("prototype")
public class EmployeeDao implements EmployeeDAOInterface 
{
	private JdbcTemplate jdbcTemplate;// it help to execute querry.
	private final static String INSERT_EMPLOYEE = "INSERT INTO employee_details(name,salary) values (?,?)";
	private final static String SELECT_ALL_EMPLOYEE = "SELECT * FROM employee_details";
	private final static String SELECT_EMPLOYEE_BY_EMPLOYEE_ID = "SELECT * FROM employee_details WHERE employee_id=?";
    private final static String UPDATE_EMPLOYEE="UPDATE employee_details SET name=?,salary=? where employee_id=?";
    private final static String DELETE_EMPLOYEE="DELETE FROM employee_details where employee_id=?";

    @Autowired 
	private EmployeeRowMapper employeeRowMapper;
	private int resultCount;

	public EmployeeDao() {
	}

	@Autowired // to genrate datasource directly by spring
	public EmployeeDao(DataSource dataSource) {

		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean adddNewEmployee(Employee employee) {

		System.out.println("Inserting new employee into database");
		System.out.println(employee);

		Object[] args = { employee.getName(), employee.getSalary() };

		resultCount = jdbcTemplate.update(INSERT_EMPLOYEE, args);

		if (resultCount > 0)
			return true;

		else {
			return false;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> employeeList = jdbcTemplate.query(SELECT_ALL_EMPLOYEE,employeeRowMapper);

		return employeeList;
	}

	@Override
	public Employee getEmployeeByEmployeeID(int employeeId) {

		Object[] args = { employeeId };
		Employee employee = jdbcTemplate.queryForObject(SELECT_EMPLOYEE_BY_EMPLOYEE_ID, args, employeeRowMapper);

		return employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		Object []args= {employee.getName(),employee.getSalary(),employee.getEmployeeId()};
	 	resultCount=jdbcTemplate.update(UPDATE_EMPLOYEE,args);
		
		if(resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		Object []args= {employeeId};
		resultCount=jdbcTemplate.update(DELETE_EMPLOYEE,args);
		
		if(resultCount>0)
			return true;
		else
		return false;
		
	}

}
