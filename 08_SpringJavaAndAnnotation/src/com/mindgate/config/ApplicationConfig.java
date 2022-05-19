package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {

//	@Bean
//	public MonthDetails monthDetails()
//	{
//		MonthDetails details = new MonthDetails();
//		return details;
//	}
//	@Bean
//	public FinancialYearDetails financialYearDetails()
//	{
//		return new FinancialYearDetails();
//	}
}
