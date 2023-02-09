package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe sumaya = new AboutMe();// Here Constructor is initialized

		// Variables are initialized
		sumaya.name = "Sumaya";
		sumaya.age = 27;
		sumaya.myCarPrice = 32445;
		sumaya.myYearlyTransactions = 376482364;
		sumaya.myHouseExpense = 7658736472686l;
		sumaya.myConsumedCalorie = 1.679f;
		sumaya.mycarOdometer = 3.67568346;
		sumaya.mySex = 'F';
		sumaya.married = true;
		sumaya.aboutMe();// Here method is initialized

		System.out.println("\n------------------------------\n");

		AboutMe alex = new AboutMe();
		alex.name = "Alex";
		alex.age = 29;
		alex.myCarPrice = 32666;
		alex.myYearlyTransactions = 376481164;
		alex.myHouseExpense = 7658736472585l;
		alex.myConsumedCalorie = 1.658f;
		alex.mycarOdometer = 3.67568234;
		alex.mySex = 'M';
		alex.married = false;
		alex.aboutMe();

	}

}
