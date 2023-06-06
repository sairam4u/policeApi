package com.epam.policeApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
		"com.epam.policeApi"})
public class PoliceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliceApiApplication.class, args);
	}

}
