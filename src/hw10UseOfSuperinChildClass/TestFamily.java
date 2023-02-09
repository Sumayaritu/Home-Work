package hw10UseOfSuperinChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Father father = new Father();

		System.out.println("\n--------------------------------------\n");
		Father father1 = new Father("Mokbul Ali", 50, 'M', true);

		System.out.println("\n--------------------------------------\n");
		father.father();

		System.out.println("\n--------------------------------------\n");
		father1.fatherInfo("Mokbul", 50, 'M', false);

		System.out.println("\n--------------------------------------\n");
		Daughter daughter = new Daughter();

		System.out.println("\n--------------------------------------\n");
		Daughter daughter1 = new Daughter("July", 25);

		System.out.println("\n--------------------------------------\n");
		daughter.daughter();

		System.out.println("\n--------------------------------------\n");
		daughter.daughterInfo("January", 24);

	}

}
