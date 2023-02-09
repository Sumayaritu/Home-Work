package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool, University {
	/*
	 * An Abstract class can Inherit another Abstract class,or a regular class. It
	 * can Inherit an Interface only by Implements keyword. 'Extends' and Implements
	 * is used for the inheritance in Java for Abstract Class.'Implements' keyword
	 * is used only for Inheriting an Interface and 'Extends' keyword is used to
	 * Inherit a Regular class.We can't use Implements keyword to Inherit a Regular
	 * class. An Abstract class can Inherit a regular class one time and can Inherit
	 * an Interface more than one time.
	 */
	// Abstract method
	// Method declared/defined
	public abstract void anatomyLab();

	// Non abstract method
	// Method is Implemented
	public void biochemistryLab() {
		System.out.println("This is from Non-Abstract method");
	}

	// Constructor
	public MedicalSchool() {
		System.out.println("This is a Constructor");
	}

}
