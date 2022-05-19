package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;

public class FinancialMain {

	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
	      FinancialYearDetails financialYearDetails = applicationContext.getBean("financialDetails",FinancialYearDetails.class);
	        
	       
	        
	        financialYearDetails.setYearStartDate(LocalDate.of(2022,05,01));
	        financialYearDetails.setYearEndDate(LocalDate.of(2022,03,3));
	        
	        System.out.println(financialYearDetails);
	        
	      MonthDetails monthDetails=  applicationContext.getBean("monthDetails",MonthDetails.class);
	           System.out.println(monthDetails);
	}
}
