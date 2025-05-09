package com.blc.elc;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		book.setBookDetails("Java Bascis", "John Doe",450.0);
		System.out.println(book.getBookDetails());
	}

}
