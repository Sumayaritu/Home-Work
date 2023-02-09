package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {
		System.out.println("Please Enter Your Hemoglobin A1C value below:");
		Scanner scanner = new Scanner(System.in);
		// Creating Variable for Hemoglobin A1C value
		double hba1c = scanner.nextDouble();

		if (hba1c > 6.4) {// Outer if block
			System.out.println("I am a diabetic patient");
		} else {
			if (hba1c >= 5.7) {// Inner if block
				System.out.println("I am a pre-diabetic patient");
			} else if (hba1c < 5.7) {
				System.out.println("I am a healthy person");
				scanner.close();
			}

		}

	}

}
