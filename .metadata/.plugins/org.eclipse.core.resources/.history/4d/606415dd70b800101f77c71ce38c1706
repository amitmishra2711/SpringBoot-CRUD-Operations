package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/getAll")
	public List<Book> getAll() {
		List<Book> list = bookService.getBooks();

		return list;
	}

	@PostMapping("/addBook")
	public String addAll(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable("id") int id) {

		return bookService.getBook(id);
	}

	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int id) {

		return bookService.deleteBook(id);
	}

	@GetMapping("/getBookByname/{title}")
	public Book getBookByName(@PathVariable("title") String name) {
		return this.bookService.getBookByName(name);
	}
	@PutMapping("/updateBook/{id}")
	public String updateBook(@PathVariable("id") int id, @RequestBody Book b)
	{
		if(bookService.updateBook(id, b))
		{
			return "Updated Successfully";
		}
		else {
			return "Un-Successfully";
		}
	}

}