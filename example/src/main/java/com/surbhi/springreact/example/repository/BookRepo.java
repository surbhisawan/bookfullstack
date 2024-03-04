package com.surbhi.springreact.example.repository;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.surbhi.springreact.example.model.Book;
import jakarta.transaction.Transactional;

@Transactional
@Component
public class BookRepo {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	List<Book> book = new ArrayList<>();
	
	@Autowired
	BookRepository br;
	
	public void saveBook(Book b) {
		logger.info("save method is called...");
		br.save(b);
	}
	
	public boolean removeBook(Book b) {
	    return this.book.remove(b);
	}
	
	public List<Book> getAllBooks(){
		return br.findAll();
	}
	

	
}
