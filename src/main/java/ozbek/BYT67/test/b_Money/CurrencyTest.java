package ozbek.BYT67.test.b_Money;

import static org.junit.Assert.*;
import ozbek.BYT67.src.b_Money.*;


import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;
	
	@Before
	public void setUp() throws Exception {
		/* Setup currencies with exchange rates */
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		NOK = new Currency("NOK", 0.14);
		EUR = new Currency("EUR", 1.50);
	}

	@Test
	public void testGetName() {
		assertEquals("SEK", SEK.getName());
		assertEquals("DKK", DKK.getName());
		assertEquals("NOK", NOK.getName());
		assertEquals("EUR", EUR.getName());
	}
	
	@Test
	public void testGetRate() {
		assertEquals(0.15, SEK.getRate(), 0);
		assertEquals(0.20, DKK.getRate(), 0);
		assertEquals(0.14, NOK.getRate(), 0);
		assertEquals(1.50, EUR.getRate(), 0);
	}
	
	@Test
	public void testSetRate() {
		double SEKRate = 0.16;
		double DKKRate = 0.22;
		double NOKRate = 0.12;
		double EURRate = 1.56;

		SEK.setRate(SEKRate);
		DKK.setRate(DKKRate);
		NOK.setRate(NOKRate);
		EUR.setRate(EURRate);

		assertEquals(SEKRate, SEK.getRate(), 0);
		assertEquals(DKKRate, DKK.getRate(), 0);
		assertEquals(NOKRate, NOK.getRate(), 0);
		assertEquals(EURRate, EUR.getRate(), 0);
	}
	
	@Test
	public void testGlobalValue() {
		assertEquals(1, SEK.universalValue(10), 0);
		assertEquals(2, DKK.universalValue(10), 0);
		assertEquals(1, NOK.universalValue(10), 0);
		assertEquals(15, EUR.universalValue(10), 0);
	}
	
	@Test
	public void testValueInThisCurrency() {
		assertEquals(100, SEK.valueInThisCurrency(10, EUR), 0);
		assertEquals(75, DKK.valueInThisCurrency(10, EUR), 0);
		assertEquals(107, NOK.valueInThisCurrency(10, EUR), 0);
		assertEquals(10, EUR.valueInThisCurrency(10, EUR), 0);
	}

}
