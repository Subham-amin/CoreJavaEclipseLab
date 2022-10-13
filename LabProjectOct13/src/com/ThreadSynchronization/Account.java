package com.ThreadSynchronization;

public class Account {

	private int Balance = 500;

	public int getBalance() {
		return Balance;
	}

	public void withdraw(int amount) {

		Balance = Balance - amount;
	}

}