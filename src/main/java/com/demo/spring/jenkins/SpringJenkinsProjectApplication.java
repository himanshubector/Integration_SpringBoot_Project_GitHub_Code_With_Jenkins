package com.demo.spring.jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJenkinsProjectApplication
{

	@PostConstruct
	public void intt()
	{
		log.info("Application started.........");
	}

	public static void main(String[] args)
	{
		log.info("Application executed.........");
		SpringApplication.run(SpringJenkinsProjectApplication.class, args);
	}

}
