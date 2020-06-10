package com.genpact.api;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfig {
	
	
	@Bean(name = "dataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {

		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "productDataSource")
	@ConfigurationProperties(prefix = "spring.proddatasource")
	public DataSource productDataSource() {

		return DataSourceBuilder.create().build();
	}
}
