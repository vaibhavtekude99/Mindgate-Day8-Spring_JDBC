package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {

////	
////	@Bean
////      public Address address()
////      {
////		System.out.println("In address of appllicationconfig");
////    	  return new Address();
////      }
////      @Bean
////	   public Employee employee()
////	   {
////    	  System.out.println("In Employee of apllicationconfig");
////    	  
////    	  
////    	  Address address=new Address();
////    	  
////    	  Employee employee=new Employee();
////    	  
////    	  employee.setAddress(address);
////		   return employee;
//	   }

}
