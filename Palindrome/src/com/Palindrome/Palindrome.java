package com.Palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string as an input to check whether it is palindrome or not");
		String input = scanner.nextLine();
		// checking whether palindrome or not
		if (isPalindrome(input)) {
			System.out.println(input + " is a Palindrome string");
		} else {
			System.out.println(input + " is not a Palindrome string");
		}
	}

	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
