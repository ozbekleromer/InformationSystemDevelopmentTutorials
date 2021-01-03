package ozbek.BYT67.test.b_Money;

import static org.junit.Assert.*;
import ozbek.BYT67.src.b_Money.*;


import org.junit.Before;
import org.junit.Test;

public class BankTest {
	Currency SEK, DKK;
	Bank SweBank, Nordea, DanskeBank;
	
	@Before
	public void setUp() throws Exception {
		DKK = new Currency("DKK", 0.20);
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		Nordea = new Bank("Nordea", SEK);
		DanskeBank = new Bank("DanskeBank", DKK);
		SweBank.openAccount("Ulrika");
		SweBank.openAccount("Bob");
		Nordea.openAccount("Bob");
		DanskeBank.openAccount("Gertrud");
	}

	@Test
	public void testGetName() {
		assertEquals("SweBank", SweBank.getName());
		assertEquals("Nordea", Nordea.getName());
		assertEquals("DanskeBank", DanskeBank.getName());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK, SweBank.getCurrency());
		assertEquals(SEK, Nordea.getCurrency());
		assertEquals(DKK, DanskeBank.getCurrency());
	}

	@Test
	public void testOpenAccount() throws AccountExistsException, AccountDoesNotExistException {
		SweBank.openAccount("SweTestAccount");
		Nordea.openAccount("NordeaTestAccount");
		DanskeBank.openAccount("DanskeTestAccount");

		SweBank.deposit("SweTestAccount", new Money(1, SEK));
		Nordea.deposit("NordeaTestAccount", new Money(2, SEK));
		DanskeBank.deposit("DanskeTestAccount", new Money(3, DKK));

		assertEquals(1, SweBank.getBalance("SweTestAccount").getAmount(), 0);
		assertEquals(2, Nordea.getBalance("NordeaTestAccount").getAmount(), 0);
		assertEquals(3, DanskeBank.getBalance("DanskeTestAccount").getAmount(), 0);
	}

	@Test
	public void testDeposit() throws AccountDoesNotExistException {
		SweBank.deposit("Ulrika", new Money(1, SEK));
		SweBank.deposit("Bob", new Money(2, SEK));
		Nordea.deposit("Bob", new Money(3, SEK));
		DanskeBank.deposit("Gertrud", new Money(4, DKK));

		assertEquals(1, SweBank.getBalance("Ulrika").getAmount(), 0);
		assertEquals(2, SweBank.getBalance("Bob").getAmount(), 0);
		assertEquals(3, Nordea.getBalance("Bob").getAmount(), 0);
		assertEquals(4, DanskeBank.getBalance("Gertrud").getAmount(), 0);
	}

	@Test
	public void testWithdraw() throws AccountDoesNotExistException {
		SweBank.withdraw("Ulrika", new Money(1, SEK));
		SweBank.withdraw("Bob", new Money(2, SEK));
		Nordea.withdraw("Bob", new Money(3, SEK));
		DanskeBank.withdraw("Gertrud", new Money(4, DKK));

		assertEquals(-1, SweBank.getBalance("Ulrika").getAmount(), 0);
		assertEquals(-2, SweBank.getBalance("Bob").getAmount(), 0);
		assertEquals(-3, Nordea.getBalance("Bob").getAmount(), 0);
		assertEquals(-4, DanskeBank.getBalance("Gertrud").getAmount(), 0);
	}
	
	@Test
	public void testGetBalance() throws AccountDoesNotExistException {
		SweBank.deposit("Ulrika", new Money(1, SEK));
		SweBank.deposit("Bob", new Money(2, SEK));
		Nordea.deposit("Bob", new Money(3, SEK));
		DanskeBank.deposit("Gertrud", new Money(4, DKK));

		assertTrue("Should be same", SweBank.getBalance("Ulrika").equals(new Money(1, SEK)));
		assertTrue("Should be same", SweBank.getBalance("Bob").equals(new Money(2, SEK)));
		assertTrue("Should be same", Nordea.getBalance("Bob").equals(new Money(3, SEK)));
		assertTrue("Should be same", DanskeBank.getBalance("Gertrud").equals(new Money(4, DKK)));
	}
	
	@Test
	public void testTransfer() throws AccountDoesNotExistException {
		SweBank.transfer("Ulrika", "Bob", new Money(5000, SEK));

		assertEquals(-5000, SweBank.getBalance("Ulrika").getAmount(), 0);
		assertEquals(5000, SweBank.getBalance("Bob").getAmount(), 0);

		SweBank.transfer("Bob", Nordea, "Bob", new Money(3000, SEK));

		assertEquals(2000, SweBank.getBalance("Bob").getAmount(), 0);
		assertEquals(3000, Nordea.getBalance("Bob").getAmount(), 0);
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		SweBank.addTimedPayment("Ulrika", "1", 2, 2, new Money(2000, SEK), SweBank, "Bob");

		SweBank.tick();
		SweBank.tick();

		assertEquals(-2000, SweBank.getBalance("Ulrika").getAmount(), 0);
		assertEquals(2000, SweBank.getBalance("Bob").getAmount(), 0);

		SweBank.addTimedPayment("Bob", "2", 2, 2, new Money(1000, SEK), Nordea, "Bob");

		SweBank.tick();
		SweBank.tick();

		assertEquals(3000, SweBank.getBalance("Bob").getAmount(), 0);
		assertEquals(1000, Nordea.getBalance("Bob").getAmount(), 0);

	}
}
