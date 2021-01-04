package ozbek.BYT8.Lab2B.RefactoringExercises.exercise04.src;

import java.io.IOException;
import java.io.Writer;

public class Person {
	public String last;

	public String first;

	public String middle;

	// All the clients methods are moved as instance method to "Person" class
	// All "Client" classes are deleted
	// "formatPerson" and "display' methods are simplified with  "toString" method

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}

	public String toString() {
		return this.last + ", " + this.first
				+ ((this.middle == null) ? "" : " " + this.middle);
	}

	public void display(Writer out) throws IOException {
		out.write(this.toString());
	}

	public String formatPerson() {
		return this.toString();
	}

	public void printPerson(Writer out) throws IOException {
		out.write(this.first);
		out.write(" ");
		if (this.middle != null) {
			out.write(this.middle);
			out.write(" ");
		}
		out.write(this.last);
	}
}