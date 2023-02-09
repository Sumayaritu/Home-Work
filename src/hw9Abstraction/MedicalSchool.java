package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool{
	/*
	 * An Abstract class can Inherit another Abstract class,It can't Inherit an
	 * Interface or a Regular class. Only one keyword 'Extends' is used for the
	 * inheritance in Java for Abstract Class An Abstract class can Inherit only one
	 * time,not more than one time.
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
