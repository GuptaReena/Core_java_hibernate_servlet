package com.bms.dao;

import java.util.HashSet;
import java.util.Set;

import com.bms.model.BookPojo;

		

public class BookDaoCollectionImpl implements BookDao {
	
	Set<BookPojo> bookDataStore;
	
	public BookDaoCollectionImpl() {
		
		 bookDataStore = new HashSet<>();
		 BookPojo book1 = new BookPojo(101,"Harry potter and the order of Phoenix","J.k Rowling","Fiction", 300," ");
		 BookPojo book2 = new BookPojo(102,"Harry potter and the chamber of secret","J.k Rowling","Fiction", 350," ");
		 BookPojo book3 = new BookPojo(103,"Harry potter and the Half Blood Prince","J.k Rowling","Fiction", 250," ");
		 
		 
		 bookDataStore.add(book1);
		 bookDataStore.add(book2);
		 bookDataStore.add(book3);
	}
	 

	@Override
	public Set<BookPojo> fetchAllBooks() {
		// TODO Auto-generated method stub
		return bookDataStore;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		
		// TODO Auto-generated method stub
		
			BookPojo returnBookPojo = null;
		for(BookPojo eachBook : bookDataStore) {
			if(eachBook.getBookId() == bookId) {
				returnBookPojo = eachBook;
				break;
			}
			
		}
		
		return returnBookPojo;
	}

	@Override
	public Set<BookPojo> fetchByGener(String Gener) {
		// TODO Auto-generated method stub
		
		Set<BookPojo> allBookByGener = new HashSet<>();
		
		for(BookPojo eachBook : bookDataStore) {
			if(eachBook.getBookGener().equals(Gener)) {
				allBookByGener.add(eachBook);
			}
		}
		
		return allBookByGener;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		
		int maxBookId = 0;
		
		for(BookPojo eachBook : bookDataStore) {
			if(eachBook.getBookId() > maxBookId) {
				maxBookId = eachBook.getBookId();
			}
			
			newBook.setBookId(maxBookId + 1);
			bookDataStore.add(newBook);
		}
		
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editbook) {
		// TODO Auto-generated method stub
		
		deleteBook(editbook.getBookId());
		bookDataStore.add(editbook);
		
		return editbook;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
		bookDataStore.removeIf((Book1) -> Book1.getBookId() == bookId);
		
	}
	
	
	

}
