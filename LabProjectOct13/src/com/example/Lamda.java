package com.example;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2000;
		int p = 1500;

		ThreadLamda myI = (a, b) -> {
			System.out.println("The output is = " + (a + b));
		};
		myI.message(i, p);
	}
}