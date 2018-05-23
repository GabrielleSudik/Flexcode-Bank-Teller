package teller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	
	Bank underTest;
	BankAccount account1;
	BankAccount account2;
	BankAccount account3;
	
	//"@Before" allows you to have object set up before you run a test
	@Before
	public void setUp(){
		underTest = new Bank();
		account1 = new BankAccount("1", "checking", 100);
		account2 = new BankAccount("2", "savings", 200);
		//these BankAccounts allow us to test code by pre-creating objects
		account3 = new BankAccount("3", "checking", 300);
	}

	@Test
	public void shouldBeAbleToAddAccount(){
		underTest.add(account1);
		BankAccount retrievedAccount = underTest.findAccount("1");
		assertThat(retrievedAccount, is(account1));
	}
	
	//fyi, you had some issue with assertThat and is.
	//they should have given you the red squiggles with options to import
	//but they didn't. you had to type it out. :(
	//that's fine, except in the future when you don't know something is wrong.
	//hm, might be cuz you hadn't saved your other classes?
	//sometimes that fixes errors

	@Test
	public void shouldBeAbleToAddTwoAccounts(){
		underTest.add(account2);
		underTest.add(account3);
		Collection<BankAccount> allAccounts = underTest.getAllAccounts();
		//assertThat(allAccounts, contains(account2, account3));
		//that last line gave me squiggles on "contains" and I couldn't figure out how to manually fix. :(
		//fortunately, we can also test this way:
		assertEquals(2, allAccounts.size());
	}
}
