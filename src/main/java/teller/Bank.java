package teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	Map<String, BankAccount> accounts = new HashMap<>();

	public void add(BankAccount account) {
		// TODO Auto-generated method stub
		accounts.put(account.getAccountNumber(), account);
		//let me explain that
		//accounts is the object you're adding to (it's a hashmap type)
		//put is the word that adds things into a hashmap
		//the stuff in parens is the (key, value)
		//but we don't want those generic words. they are useless in code.
		//we use exactly what goes there:
		//key = getAccountNumber
		//value = account (or rather, the argument that is passed to this method)
		
	}

	public BankAccount findAccount(String accountNumber) {
		// TODO Auto-generated method stub
		//return null;
		return accounts.get(accountNumber);
	}

	public Collection<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		//return null;
		return accounts.values();
		
	}

	
	
}
