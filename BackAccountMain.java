package com.blc.elc;

public class BackAccountMain {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.setAccountDetails("Rahul", 123456,5000.0);
		System.out.println(bank.getAccountDetails());
	}

}
