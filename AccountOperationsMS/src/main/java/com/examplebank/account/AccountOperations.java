package com.examplebank.account;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountOperations {
	private static Map<Integer, Account> accounts = null;

	static {
		accounts = new HashMap<Integer, Account>();

		Account jamesAccount = new Account();
		jamesAccount.setAccountName("James Cooper");
		jamesAccount.setAccountNumber(1234567890);
		jamesAccount.setBalance(18000);
		jamesAccount.setCustomerID(100);
		jamesAccount.setDateOpened((new java.util.Date()).toString());
		jamesAccount.setInterest(0.08);
		jamesAccount.setOpeningBalance(18000);

		accounts.put(jamesAccount.getAccountNumber(), jamesAccount);
	}
	
	// http://localhost:8080/AccountOperationsMS/accounts + GET
	@RequestMapping(path = "/accounts", method = RequestMethod.GET)
	public Collection<Account> getAllAccount(){
		return accounts.values();
	}
	
	@RequestMapping(value = "/accounts/{accNumber}", method = RequestMethod.GET)
	public ResponseEntity<Account> getAccount(@PathVariable("accNumber") Integer accNumber) {
		ResponseEntity<Account> response = null;
		Account account = accounts.get(accNumber);
		if (account == null) {
			response = new ResponseEntity<Account>(account, HttpStatus.NOT_FOUND);
		}else {
			response = new ResponseEntity<Account>(account, HttpStatus.OK);
		}
		return response;
	}
}