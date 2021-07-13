package com.jeff.porter.testservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// http://localhost:8080/prices/test
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class TestServiceApplication
{

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}

}
