package com.gap.jenkinsfiledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JenkinsfiledemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsfiledemoApplication.class, args);
	}

}
