package ozbek.BYT67.test.b_Money;

import static org.junit.Assert.*;
import ozbek.BYT67.src.b_Money.*;


import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	Currency SEK, DKK, NOK, EUR;
	Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
		SEK100 = new Money(10000, SEK);
		EUR10 = new Money(1000, EUR);
		SEK200 = new Money(20000, SEK);
		EUR20 = new Money(2000, EUR);
		SEK0 = new Money(0, SEK);
		EUR0 = new Money(0, EUR);
		SEKn100 = new Money(-10000, SEK);
	}

	@Test
	public void testGetAmount() {
		assertEquals(10000, SEK100.getAmount(), 0);
		assertEquals(1000, EUR10.getAmount(), 0);
		assertEquals(20000, SEK200.getAmount(), 0);
		assertEquals(2000, EUR20.getAmount(), 0);
		assertEquals(0, SEK0.getAmount(), 0);
		assertEquals(0, EUR0.getAmount(), 0);
		assertEquals(-10000, SEKn100.getAmount(), 0);
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK, SEK100.getCurrency());
		assertEquals(EUR, EUR10.getCurrency());
		assertEquals(SEK, SEK200.getCurrency());
		assertEquals(EUR, EUR20.getCurrency());
		assertEquals(SEK, SEK0.getCurrency());
		assertEquals(EUR, EUR0.getCurrency());
		assertEquals(SEK, SEKn100.getCurrency());
	}

	@Test
	public void testToString() {
		assertEquals("10000 SEK", SEK100.toString());
		assertEquals("1000 EUR", EUR10.toString());
		assertEquals("20000 SEK", SEK200.toString());
		assertEquals("2000 EUR", EUR20.toString());
		assertEquals("0 SEK", SEK0.toString());
		assertEquals("0 EUR", EUR0.toString());
		assertEquals("-10000 SEK", SEKn100.toString());
	}

	@Test
	public void testGlobalValue() {
		assertEquals(1500, SEK100.universalValue(), 0);
		assertEquals(1500, EUR10.universalValue(), 0);
		assertEquals(3000, SEK200.universalValue(), 0);
		assertEquals(3000, EUR20.universalValue(), 0);
		assertEquals(0, SEK0.universalValue(), 0);
		assertEquals(0, EUR0.universalValue(), 0);
		assertEquals(-1500, SEKn100.universalValue(), 0);
	}

	@Test
	public void testEqualsMoney() {
		String tmsg = "Should be equal";
		String fmsg = "Should not be equal";

		assertTrue(tmsg, SEK200.equals(EUR20));
		assertTrue(tmsg, SEK100.equals(EUR10));
		assertTrue(tmsg, SEK0.equals(EUR0));

		assertFalse(fmsg, SEK200.equals(EUR10));
		assertFalse(fmsg, SEK100.equals(EUR0));
		assertFalse(fmsg, SEK0.equals(EUR20));
	}

	@Test
	public void testAdd() {
		String tmsg = "Should be equal";
		String fmsg = "Should not be equal";

		assertTrue(tmsg, new Money(30000, SEK).equals(new Money(10000, SEK).add(SEK200)));
		assertTrue(tmsg, new Money(3000, EUR).equals(new Money(1000, EUR).add(EUR20)));
		assertTrue(tmsg, new Money(20000, SEK).equals(new Money(10000, SEK).add(SEK100)));
		assertTrue(tmsg, new Money(2000, EUR).equals(new Money(1000, EUR).add(EUR10)));

		assertFalse(fmsg, new Money(20000, SEK).equals(new Money(10000, SEK).add(SEK200)));
		assertFalse(fmsg, new Money(2000, EUR).equals(new Money(1000, EUR).add(EUR20)));
		assertFalse(fmsg, new Money(20000, SEK).equals(new Money(10000, SEK).add(SEK0)));
		assertFalse(fmsg, new Money(2000, EUR).equals(new Money(1000, EUR).add(EUR0)));
	}

	@Test
	public void testSub() {
		String tmsg = "Should be equal";
		String fmsg = "Should not be equal";

		assertTrue(tmsg, new Money(10000, SEK).equals(new Money(30000, SEK).sub(SEK200)));
		assertTrue(tmsg, new Money(1000, EUR).equals(new Money(3000, EUR).sub(EUR20)));
		assertTrue(tmsg, new Money(20000, SEK).equals(new Money(30000, SEK).sub(SEK100)));
		assertTrue(tmsg, new Money(2000, EUR).equals(new Money(3000, EUR).sub(EUR10)));

		assertFalse(fmsg, new Money(20000, SEK).equals(new Money(30000, SEK).sub(SEK200)));
		assertFalse(fmsg, new Money(2000, EUR).equals(new Money(3000, EUR).sub(EUR20)));
		assertFalse(fmsg, new Money(20000, SEK).equals(new Money(30000, SEK).sub(SEK0)));
		assertFalse(fmsg, new Money(2000, EUR).equals(new Money(3000, EUR).sub(EUR0)));
	}

	@Test
	public void testIsZero() {
		String tmsg = "Should be equal";
		String fmsg = "Should not be equal";

		assertTrue(tmsg, SEK0.isZero());
		assertTrue(tmsg, EUR0.isZero());

		assertFalse(fmsg, SEK200.isZero());
		assertFalse(fmsg, EUR20.isZero());
	}

	@Test
	public void testNegate() {
		String tmsg = "Should be equal";

		assertTrue(tmsg, SEK100.equals(SEKn100.negate()));
		assertTrue(tmsg, SEKn100.equals(SEK100.negate()));
		assertTrue(tmsg, EUR20.equals(new Money(-2000, EUR).negate()));
		assertTrue(tmsg, EUR10.equals(new Money(-1000, EUR).negate()));
	}

	@Test
	public void testCompareTo() {
		String tmsg = "Should be equal";
		String fmsg = "Should not be equal";

		assertEquals(0, SEK0.compareTo(EUR0));
		assertEquals(0, SEK100.compareTo(EUR10));
		assertEquals(0, SEK200.compareTo(EUR20));

		assertEquals(-1500, SEK100.compareTo(SEK200));
		assertEquals(-1500, EUR10.compareTo(EUR20));

		assertEquals(1500, SEK200.compareTo(SEK100));
		assertEquals(1500, EUR20.compareTo(EUR10));
	}
}
