package com.Book;

public class Book {
	private String bookname;
	private double price;
	private String authour;

	public Book() {

	}

	public Book(String bookname, double price, String authour) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.authour = authour;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", price=" + price + ", authour=" + authour + "]";
	}

	public String getPriceOfBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
