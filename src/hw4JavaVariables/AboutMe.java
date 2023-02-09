package hw4JavaVariables;

public class AboutMe {
	// variables are declared
	public String name;
	public byte age;
	public short myCarPrice;
	public int myYearlyTransactions;
	public long myHouseExpense;
	public float myConsumedCalorie;
	public double mycarOdometer;
	public char mySex;
	public boolean married;

	// This is a Constructor
	// Here Constructor is declared
	public AboutMe() {
		System.out.println("This is all about us");
	}

	// This is method
	// Here method is implemented
	public void aboutMe() {
		System.out.println("My name:" + name + "\nMy Age :" + age + "\nMyCar Price:" + myCarPrice
				+ "\nMyYearly Transactions :" + myYearlyTransactions + "\nMyHouse Expense:" + myHouseExpense
				+ "\nMyConsumed Calorie:" + myConsumedCalorie + "\nMyCar Odometer:" + mycarOdometer + "\nMy Sex:"
				+ mySex + "\nMarried:" + married);

	}

}
