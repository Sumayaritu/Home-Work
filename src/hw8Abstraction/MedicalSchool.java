package hw8Abstraction;

public abstract class MedicalSchool {
	// Abstract method
		// Method declared/defined
		public abstract void anatomyLab() ;

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



