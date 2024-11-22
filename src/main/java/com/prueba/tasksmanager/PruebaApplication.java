package com.prueba.tasksmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.prueba.tasksmanager.mapper")
public class PruebaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}
}
