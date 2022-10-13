package com.ThreadSynchronization;

public class BankAccount implements Runnable {

	private Account ac = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread("Subham");
		Thread t2 = new Thread("Ayan");

		t1.start();
		t2.start();

	}

	synchronized void makeWithdrawal(int amt) {
		if (ac.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "  is going to withdraw " + amt);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ac.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "  has withdrawn " + amt);
		} else {
			System.out.println(Thread.currentThread().getName() + "  is not having enough balance to withdraw " + amt);
			System.out.println("The balance is" + ac.getBalance());
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeWithdrawal(400);
		if (ac.getBalance() < 0) {
			System.out.println("Amount is overdew");
		}

	}

}