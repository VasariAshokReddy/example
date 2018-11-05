package com.app;

public class Book {

	private String bookname;
	 private int bookprice;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	 
	 
}
