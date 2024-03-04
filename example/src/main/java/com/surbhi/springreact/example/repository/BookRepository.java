package com.surbhi.springreact.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.surbhi.springreact.example.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
