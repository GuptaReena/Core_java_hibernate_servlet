package com.bms.dao;

public class DBQueries {

	public static final String FETCH_ALL_BOOKS = "select * from book_details";
	public static final String FETCH_A_BOOK = "select * from book_details where book_id =";
	public static final String FETCH_BOOKS_BY_GENER = "select * from book_details where book_gener =";
	public static final String ADD_BOOKS = "INSERT INTO book_details(book_title,book_author,book_gener,book_price, book_img_url) VALUES(?,?,?,?,?)";
	public static final String LAST_INSERT_VALUE = "select last_insert_id()";
	public static final String UPDATE_BOOK = "Update book_details set book_price=? where book_id=?";
	public static final String DELETE_BOOK = "delete from book_details where book_id=";
	
}
