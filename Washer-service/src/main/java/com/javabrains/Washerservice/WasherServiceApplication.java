package com.javabrains.Washerservice;

import com.javabrains.Washerservice.repository.WasherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WasherServiceApplication  {


	public static void main(String[] args) {
		SpringApplication.run(WasherServiceApplication.class, args);
	}


}
