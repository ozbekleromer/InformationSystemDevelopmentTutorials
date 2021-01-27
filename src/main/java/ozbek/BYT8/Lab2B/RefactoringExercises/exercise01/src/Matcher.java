package ozbek.BYT8.Lab2B.RefactoringExercises.exercise01.src;

public class Matcher {
	public Matcher() {
	}

	// Refactored as static because It does not use any property of Matcher object
	// Two for loop merged. Using two different loops for checking same element is unnecessary

	public static boolean match(int[] expected, int[] actual, int clipLimit, int delta) {
		// Check for length differences
		if (actual.length != expected.length)
			return false;

		for (int i = 0; i < actual.length; i++) {
			// Clip "too-large" values
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;
			// Check that each entry within expected +/- delta
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;
		}
		return true;
	}
}