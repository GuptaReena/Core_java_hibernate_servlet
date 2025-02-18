package com.bms.model;

import java.util.Objects;

public class BookPojo {
	
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookGener;
	private int bookPrice;
	private String bookImgUrl;
	
	
	
	public BookPojo(int bookId, String bookName, String bookAuthor, String bookGener, int bookPrice,
			String bookImgUrl) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookGener = bookGener;
		this.bookPrice = bookPrice;
		this.bookImgUrl = bookImgUrl;
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getBookAuthor() {
		return bookAuthor;
	}



	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public String getBookGener() {
		return bookGener;
	}



	public void setBookGener(String bookGener) {
		this.bookGener = bookGener;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public String getBookImgUrl() {
		return bookImgUrl;
	}



	public void setBookImgUrl(String bookImgUrl) {
		this.bookImgUrl = bookImgUrl;
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPojo other = (BookPojo) obj;
		return bookId == other.bookId;
	}



	@Override
	public String toString() {
		return "[bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor 
				 + ", bookGener=" + bookGener + ", bookPrice=" + bookPrice + ", bookImgUrl=" + bookImgUrl
				+ "]";
	}
	
	

	
	

}
