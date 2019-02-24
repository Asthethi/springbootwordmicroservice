package com.springbootmicroservice.api.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DbConfiguration {

	@Bean
	@Primary
	public DataSource dataSource() {
	    return DataSourceBuilder
	        .create()
	        .username("root")
	        .password("root")
	        .url("jdbc:mysql://localhost:3306/test")
	        .driverClassName("com.mysql.jdbc.Driver")
	        .build();
	}
}