package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;

@Service
public class BookService {
public static List<com.example.demo.entity.Book> list=new ArrayList<>();

static {
	list.add(new Book(1,"Anne Frank","The Diary of young Girl"));
	list.add(new Book(2,"Frank","The Diary"));
	list.add(new Book(3,"Anne","Young Girl"));
}
public List<Book> getAll()
{
	return list;
}
public Book addBook(Book b)
{
	list.add(b);
	return b;
}


public Book getBookById(int  id) {
	Book book = null;
	Iterator<Book> itr = list.iterator();
	while (itr.hasNext()) {
		book = (Book) itr.next();
		if (book.getId()==id) {
			return book;
		}
	}
	return null; 
}
public String removeBook(int id)
{
	Book book = null;
	Iterator<Book> itr = list.iterator();
	while (itr.hasNext()) {
		book = (Book) itr.next();
		if (book.getId() == id) {
			itr.remove();
			return "Book deleted Successfully";
		}
	}
	return "Book Not Found";
}
public boolean updateBook(Book b)
{
	Book book=null;
	Iterator<Book> itr=list.iterator();
	while(itr.hasNext())
	{
		book= itr.next();
		if(book.getId()==b.getId())
		{
			book.setAuthor(b.getAuthor());
			book.setTitle(b.getTitle());
			return true;
		}
	}
	return false;
}
}
