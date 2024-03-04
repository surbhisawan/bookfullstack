package com.surbhi.springreact.example.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surbhi.springreact.example.model.Book;
import com.surbhi.springreact.example.repository.BookRepo;
import com.surbhi.springreact.example.repository.BookRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {
	
	@Autowired
	BookRepo br;
	
	@Autowired
	BookRepository brp;
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return this.br.getAllBooks();
	}
	
	@PostMapping("addbook")
	public ResponseEntity<Object> addBook(@RequestBody Book book) {
		br.saveBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping("deletebook/{id}")
	public ResponseEntity<Object> deleteBook(@PathVariable int id) {
		brp.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("updatebook")
	public List<Book> updateBook(@RequestBody Book book) {
		br.saveBook(book);
		
		return brp.findAll();
	}
	
	
	
	
}
