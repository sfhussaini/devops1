package com.examplebank.account;

public class Transaction {
	private int id;
	private int accountNumber;
	private double amount;
	private String transDate;
	private String natureOfTransaction;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getNatureOfTransaction() {
		return natureOfTransaction;
	}
	public void setNatureOfTransaction(String natureOfTransaction) {
		this.natureOfTransaction = natureOfTransaction;
	}
}