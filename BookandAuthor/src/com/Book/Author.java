package com.Book;

public class Author {

	private String authorname;
	private String authorCountry;
	private int authorage;

	public Author(String authorname, String authorCountry, int authorage) {
		super();
		this.authorname = authorname;
		this.authorCountry = authorCountry;
		this.authorage = authorage;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthorCountry() {
		return authorCountry;
	}

	public void setAuthorCountry(String authorCountry) {
		this.authorCountry = authorCountry;
	}

	public int getAuthorage() {
		return authorage;
	}

	public void setAuthorage(int authorage) {
		this.authorage = authorage;
	}

	@Override
	public String toString() {
		return "Author [authorname=" + authorname + ", authorCountry=" + authorCountry + ", authorage=" + authorage
				+ "]";
	}

}
