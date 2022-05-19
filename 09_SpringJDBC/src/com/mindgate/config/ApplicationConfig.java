package com.mindgate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.mindgate")
@PropertySource("classpath:dbconnection.properties") // for database connection
public class ApplicationConfig {
	@Autowired
	Environment environment;// it helps to read the properties

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();// it loads DriverManagerdatasource object
		/*settting the value in the driverManagerDataSource using environment
		 Which is created by Autowired  or by spring . 
		 */
		
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("user"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));

		return driverManagerDataSource;

	}
}
