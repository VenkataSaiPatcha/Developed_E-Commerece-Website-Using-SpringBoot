package com.esai.usingDataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.sai")  
@EnableJpaRepositories(basePackages = "com.sai.Repo")
@EntityScan(basePackages="com.sai.Model")
public class EcommereceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommereceProjectApplication.class, args);
		
	}

}
