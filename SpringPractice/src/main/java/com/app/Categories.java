package com.app;

public class Categories {

	private String name;
	 private Book bk;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + "]";
	}
	 
	
}
