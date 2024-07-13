package com.bms.service;

import java.util.Set;

import com.bms.model.BookPojo;

public interface BookService {


	/*Here we are using Abstraction 
	 * 
	 *  Abstract classes
	 *  
	 */	

	Set<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	Set<BookPojo> fetchByGener(String Gener);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editbook);
	void deleteBook(int bookId);
	
	
}
