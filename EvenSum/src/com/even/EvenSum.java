package com.even;

import java.util.Scanner;

class EvenSum {
	public static void main(String[] args) {
		int i, j, k, l;
		System.out.println("Enter four even nuber to Addition");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		j = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		k = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		l = sc1.nextInt();
		int sum = i + j + k + l;
		if (i % 2 == 0) {
			// print output
			System.out.println("Sum of EvenNumber is " + sum);

		} else {
			System.out.println("Wrong input");
		}
	}
}
// end of class