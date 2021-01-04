package ozbek.BYT8.Lab2B.RefactoringExercises.exercise01.src;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MatcherTest {

	@Test
	public void testMatch() {
		Matcher matcher = new Matcher();

		int[] expected = new int[] { 10, 50, 30, 98 };
		int clipLimit = 100;
		int delta = 5;

		int[] actual = new int[] { 12, 55, 25, 110 };

		assertTrue(Matcher.match(expected, actual, clipLimit, delta));

		actual = new int[] { 10, 60, 30, 98 };
		assertTrue(!Matcher.match(expected, actual, clipLimit, delta));

		actual = new int[] { 10, 50, 30 };
		assertTrue(!Matcher.match(expected, actual, clipLimit, delta));
	}
}
