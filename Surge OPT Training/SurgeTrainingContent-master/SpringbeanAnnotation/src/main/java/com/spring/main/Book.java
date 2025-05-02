package com.spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
	private Author author;
	private String isbn;
	private String year;
	
	public Author getAuthor() {
		return author;
	}
	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
    public String toString() {
        return "Book[ISBN=" + isbn + ", Author=" + author + ", Year=" + year + "]";
    }

}
