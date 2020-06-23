package com.alex.potenza.lms;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo(scanBasePackages="com.alex.potenza.lms.service.impl")
public class PotenzaLmsSysCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotenzaLmsSysCoreServiceApplication.class, args);
	}

}
