package ozbek.BYT8.Lab2B.RefactoringExercises.exercise02.src;

import java.util.*;

public class Configuration {
	public int interval;

	public int duration;

	public int departure;

	// Extracted private method "getValue" from the load
	// In order avoid 3rd if statement at interval added new if statement
	// By the way, we avoid repeating code

	public void load(Properties props) throws ConfigurationException {
		interval = getValue(props, "interval", "monitor interval", "monitor interval > 0", "");

		duration = getValue(props, "duration", "duration", "duration > 0", "duration % interval");

		departure = getValue(props, "departure", "departure offset", "departure > 0", "departure % interval");
	}

	private int getValue(Properties props, String prop, String errMsg1, String errMsg2, String errMsg3) throws ConfigurationException {
		String valueString;
		int value;
		valueString = props.getProperty(prop);
		if (valueString == null) {
			throw new ConfigurationException(errMsg1);
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException(errMsg2);
		}
		if (!prop.equals("interval")) {
			if ((value % interval) != 0) {
				throw new ConfigurationException(errMsg3);
			}
		}
		return value;
	}
}
