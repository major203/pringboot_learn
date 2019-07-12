package com.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.login.mapper")
@SpringBootApplication
public class TestLogin2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestLogin2Application.class, args);
	}

}
