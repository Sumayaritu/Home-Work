package hw10UseOfSuperinChildClass;

public class Daughter extends Father {
	public String BirthMonth;
	public int Age;

	// Default Constructor
	public Daughter() {
		super("Mokbul", 51, 'M', true);// Parameterized Constructor

		// Super keyword called the Void Method
		super.father();

		// Super keyword called the Parameterized Method
		super.fatherInfo("Mokbul", 52, 'M', false);
		
		//Variable is Initialized
		super.FamilyName = "Ali";
		System.out.println("Family Name is:" + FamilyName);

		System.out.println("This is a Default Constructor from Daughter(Child) Class");
	}

	// Parameterized Constructor
	public Daughter(String BirthMonth, int Age) {
		super();

		super.father();
		super.fatherInfo("Mokbul", 51, 'M', true);

		this.BirthMonth = BirthMonth;
		this.Age = Age;
		System.out.println("Daughter's Birth Month is:" + BirthMonth + "Daughter's Age:" + Age);
	}

	// Void type Method
	public void daughter() {
		super.father();

		super.fatherInfo("Mokbul", 50, 'M', true);

		System.out.println("This is a Void type Method from Daughter(Child) Class");

	}

	// Parameterized Method
	public void daughterInfo(String BirthMonth, int Age) {
		super.father();

		super.fatherInfo("Mokbul", 50, 'M', true);

		this.BirthMonth = BirthMonth;
		this.Age = Age;
		System.out.println("Daughter's Birth Month is:" + BirthMonth + "Daughter's Age:" + Age);
	}

}
