package com.Book;

public class DisplayBookDetails {
	static void DisplayBookDetails(Book b1) {
		System.out.println("Book name is =" + b1.getBookname());
		System.out.println("Price of book is =" + b1.getPrice());
		System.out.println("Author name is =" + b1.getAuthour());
	}

	public static void main(String[] args) {

		Book b1 = new Book("Rich Dad Poor Dad", 2500, "Subham");
		System.out.println("book Details are given below:");
		DisplayBookDetails(b1);
	}

}
