package com.yashik.NomadNest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NomadNestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NomadNestApplication.class, args);
	}

}
