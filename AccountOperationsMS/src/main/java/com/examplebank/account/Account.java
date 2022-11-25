package com.examplebank.account;

public class Account {
	private int errorCode;
	
	private int accountNumber;
	private double balance;
	private double openingBalance;
	private String accountName;
	private int customerID;
	public String getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}

	private String dateOpened;
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public java.util.List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(java.util.List<Transaction> transactions) {
		this.transactions = transactions;
	}

	private double interest;
	
	private java.util.List<Transaction> transactions;
}
