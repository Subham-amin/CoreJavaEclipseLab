package com.bank;

import java.util.Scanner;

class MyPiggiebank {

	static int amount = 50;

	// display method
	static void display(MyPiggiebank a) {
		int amount1;
		System.out.println("Opening balance = " + amount);
		System.out.println("----------*****----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for add Ammount");
		System.out.println("2 for View Balance");
		System.out.println("Enter your choice");
		System.out.println("----------*****----------");
		amount1 = sc.nextInt();
		switch (amount1) {
		case 1:
			System.out.println("Enter your amount for add");
			amount1 = sc.nextInt();
			System.out.print("New balance is = ");
			System.out.println(+amount1 + amount);
			break;
		case 2:
			System.out.println("Your current balance is = " + amount);
			break;
		default:
			System.out.println("Wrong input");

		}

	}

	public static void main(String[] args) {
		MyPiggiebank a1 = new MyPiggiebank();
		display(a1);
	}

}