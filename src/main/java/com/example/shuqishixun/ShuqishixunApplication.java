package com.example.shuqishixun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.example.shuqishixun.dao")
@SpringBootApplication
public class ShuqishixunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShuqishixunApplication.class, args);
	}

}
