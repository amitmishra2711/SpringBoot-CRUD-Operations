package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookservice;
	@GetMapping("/getAll")
	
	
// public String getAllBooks()
// {
//	 return bookservice.getBooks();
// }
	
	public List<Book> getAllBooks()
	 {
		List<Book> list = bookservice.getBooks();
		 
		return  list;
	 }
	@PostMapping("/addBook")
	public String bookAdd(@RequestBody Book book)
	{
		return bookservice.addBook(book);
		
	}
}
