package ozbek.BYT67.test.b_Money;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ozbek.BYT67.src.b_Money.*;


public class AccountTest {
	Currency SEK, DKK;
	Bank Nordea;
	Bank DanskeBank;
	Bank SweBank;
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		SweBank.openAccount("Alice");
		testAccount = new Account("Hans", SEK);
		testAccount.deposit(new Money(10000000, SEK));

		SweBank.deposit("Alice", new Money(1000000, SEK));
	}
	
	@Test
	public void testAddRemoveTimedPayment() {
		testAccount.addTimedPayment("Rent1", 30, 30, new Money(500000, SEK), SweBank, "Alice");

		assertTrue("Should be exists!", testAccount.timedPaymentExists("Rent1"));

		testAccount.removeTimedPayment("Rent1");

		assertFalse("Should not be exists!", testAccount.timedPaymentExists("Rent1"));
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		testAccount.addTimedPayment("Rent1", 2, 2, new Money(5000000, SEK), SweBank, "Alice");

		assertEquals(10000000, testAccount.getBalance().getAmount(), 0);
		assertEquals(1000000, SweBank.getBalance("Alice").getAmount(), 0);

		testAccount.tick();
		testAccount.tick();

		assertEquals(5000000, testAccount.getBalance().getAmount(), 0);
		assertEquals(6000000, SweBank.getBalance("Alice").getAmount(), 0);

		testAccount.tick();
		testAccount.tick();

		assertEquals(0, testAccount.getBalance().getAmount(), 0);
		assertEquals(11000000, SweBank.getBalance("Alice").getAmount(), 0);
	}

	@Test
	public void testAddWithdraw() {
		testAccount.withdraw(new Money(5000000, SEK));

		assertEquals(5000000, testAccount.getBalance().getAmount(), 0);

		testAccount.withdraw(new Money(5000000, SEK));

		assertEquals(0, testAccount.getBalance().getAmount(), 0);
	}
	
	@Test
	public void testGetBalance() {
		assertTrue("Should be equal", testAccount.getBalance().equals(new Money(10000000, SEK)));
		assertFalse("Should be not equal", testAccount.getBalance().equals(new Money(5000000, SEK)));
	}
}
