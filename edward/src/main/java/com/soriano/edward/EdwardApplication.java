package com.soriano.edward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude= DataSourceAutoConfiguration.class)
public class EdwardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdwardApplication.class, args);
	}

}
