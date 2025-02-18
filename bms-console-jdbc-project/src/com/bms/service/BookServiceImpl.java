package com.bms.service;

import java.util.Set;

import com.bms.dao.BookDao;
import com.bms.dao.BookDaoJdbcImpl;
import com.bms.model.BookPojo;

public class BookServiceImpl implements BookService{
	
	
	BookDao bookDao;
	
	public BookServiceImpl() {
		
		bookDao = new BookDaoJdbcImpl();
		
	}
	

	@Override
	public Set<BookPojo> fetchAllBooks() {
		
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		
		return bookDao.fetchABook(bookId);
	}

	@Override
	public Set<BookPojo> fetchByGener(String Gener) {
		
		return bookDao.fetchByGener(Gener);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo editbook) {
		
		return bookDao.updateBook(editbook);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
		
	}

}
