package com.example.demo.entity;

public class Book {
	private int in;
	private String title;
	private String author;
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int in, String title, String author) {
		super();
		this.in = in;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [in=" + in + ", title=" + title + ", author=" + author + "]";
	}
	

}
