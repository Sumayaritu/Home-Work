package hw3JavaVariables;

public class AboutMe {
	public String Universityname;
	// Variable declared

	public String country = "Bangladesh";
	public int year = 2023;
	public char sex = 'F';
	public boolean married = true;
	public byte age = 109;
	public short s = 32677;
	public long distance = 922337203685477806l;
	public float myweight = 1.7836381f;
	public double value = 3.1463647637647252;
	// Variables are intialized

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("country:" + aboutMe.country + "\n year: " + aboutMe.year + "\n sex:" + aboutMe.sex);

		System.out.println("s=" + aboutMe.s);

	}

}
