package com.Gg.BookProject.service;

	import com.bookstore.springboot.entity.Book;
	import java.util.List;
	
	public interface BookService {
	
	Book createBook (Book book);
	
	Book getBookById(Long bookId);
	
	This Line declares a method named getAllBooks that takes no parameters and returns a List<Book>. The getAllBooks method is responsible for retrieving all books from a data source.
	List<Book> getAllBooks();
	
	
	Book updateBook(Book book);
	void deleteBook(Long bookId);
	}

