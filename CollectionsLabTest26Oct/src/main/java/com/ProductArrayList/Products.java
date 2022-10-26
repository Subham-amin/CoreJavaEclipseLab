/*
 Name - Subham Amin.
 Product Base Shorting System.
 */

package com.ProductArrayList;

public class Products implements Comparable<Products> {
	private String ProductName;
	private int ProductPrice;
	private int ProductQuantity;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String productName, int productPrice, int productQuantity) {
		super();
		ProductName = productName;
		ProductPrice = productPrice;
		ProductQuantity = productQuantity;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public int getProductQuantity() {
		return ProductQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Products [ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + ", ProductQuantity="
				+ ProductQuantity + "]";
	}

	@Override
	public int compareTo(Products p) {
		// TODO Auto-generated method stub
		if (ProductPrice == p.ProductPrice)
			return 0;
		else if (ProductPrice > p.ProductPrice)
			return 1;
		else
			return -1;
	}

}
