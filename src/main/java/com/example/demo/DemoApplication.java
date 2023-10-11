package com.example.demo;

import com.example.demo.entity.Costumer;
import com.example.demo.repository.CostumerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CostumerRepository costumerRepository)
	{
		return args->{
			costumerRepository.save(new Costumer(null,"Enit","enit@gmail.com"));
			costumerRepository.save(new Costumer(null,"Iset","iset@gmail.com"));
			costumerRepository.save(new Costumer(null,"Esprit","esprit@gmail.com"));
			costumerRepository.findAll().forEach(System.out::println);
		};
	}
}

