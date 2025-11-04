package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Book;

@Service
public class BookService {

	public static List<Book> list =new ArrayList<>();
	static {
		list.add(new Book(101,"Java","James Gosling"));
		list.add(new Book(102,"Java","James Gosling"));
		list.add(new Book(103,"Java","James Gosling"));
	}
//	public String getBooks()
//	{
//		return "List of Book";
//	}
	
	public List<Book> getBooks()
	{
		return list;
	}
	
	public String addBook(Book book)
	{
		
		list.add(book);
		return "book added Successfully";
	}

	
	
}
