package hw9Encapsulation;

public class Employee {
	private String Name;
	private int Age;
	private char Sex;
	private boolean Citizen;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public char getSex() {
		return Sex;
	}

	public void setSex(char Sex) {
		this.Sex = Sex;
	}

	public boolean getCitizen() {
		return Citizen;
	}

	public void setCitizen(boolean Citizen) {
		this.Citizen = Citizen;
	}

}
