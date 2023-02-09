package hw5Q2Constructor;

public class Computer {
	// Variables are declared
	public String brand, model, operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// Default Constructor declared
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");

	}

	// Parameterized Constructor declared
	public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + "\nMy Model: " + model + "\nOperating system: " + operatingsystem
				+ "\nPrice: " + price + "\nGrade: " + grade + "\nMade In the USA: " + madeInUSA);

	}

	public Computer(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	public Computer(int price, char grade, boolean madeInUSA) {
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

	}

}
