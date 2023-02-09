package hw10UseOfSuperinChildClass;

public class Father {
	public String Name;
	public int Age;
	public char Sex;
	public boolean UsCitizen;
	public String FamilyName;

	// Default Constructor
	public Father() {
		System.out.println("This is a Default Constructor from Father(Parent) Class");
	}

	// Parameterized Constructor
	public Father(String Name, int Age, char Sex, boolean UsCitizen) {
		this.Name = Name;
		this.Age = Age;
		this.Sex = Sex;
		this.UsCitizen = UsCitizen;
		System.out.println("Father's Name is:" + Name + "Age:" + Age + "Sex:" + Sex + "UsCitizen?:" + UsCitizen);
	}

	// Void type Method
	// Method is Implemented
	public void father() {
		System.out.println("This is a Default Method from Father(Parent) Class");

	}

	// Parameterized Method
	public void fatherInfo(String Name, int Age, char Sex, boolean UsCitizen) {
		this.Name = Name;
		this.Age = Age;
		this.Sex = Sex;
		this.UsCitizen = UsCitizen;
		System.out.println("Father's Name is:" + Name + "Age:" + Age + "Sex:" + Sex + "UsCitizen?:" + UsCitizen);

	}

}
