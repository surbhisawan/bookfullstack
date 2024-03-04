package com.surbhi.springreact.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.surbhi.springreact.example.model.Book;
import com.surbhi.springreact.example.repository.BookRepository;

@SpringBootApplication
public class ExampleApplication implements CommandLineRunner{
	
	@Autowired
	BookRepository br;
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book b = new Book(1,"Magic of Love", 1200);
		br.save(b);
		
	}

}
