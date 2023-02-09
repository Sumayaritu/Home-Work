package hw10Abstraction;

public class ColumbiaUniversity extends NursingSchool implements University, VocationalSchool {
	/*
	 * 'Extends'keyword is used for the inheritance in Java for a regular Class ,A
	 * regular class can extends a regular class and an Abstract class only one
	 * time. It can inherit an Interface by Implements keyword only. A regular class
	 * can inherit an Interface more than one time by Implements keyword.
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

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

}
