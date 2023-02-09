package hw9Abstraction;

public class ColumbiaUniversity extends NYUniversity  {
	/*
	 * 'Extends'keyword is used for the inheritance in Java for a regular Class A
	 * regular class can extends only a regular class It can't inherit an
	 * Interface/an Abstract class A regular class can inherit only one time by
	 * extend keyword
	 */

	// Non abstract method
	// Method is Implemented
	public void biology() {
		System.out.println("This is a non abstract method");
	}
	// Inside class Method can only be Implemented not Declared

	public ColumbiaUniversity() {
		System.out.println("This is a Constructor");

	}


	

}
