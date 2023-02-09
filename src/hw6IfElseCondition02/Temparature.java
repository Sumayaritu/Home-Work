package hw6IfElseCondition02;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		System.out.println("-----Today's Weather-----");
		Scanner scanner = new Scanner(System.in);

		int temparature = scanner.nextInt();

		if (temparature < 32) {
			System.out.println("Freezing");
		} else if (temparature < 55) {
			System.out.println("Pleasent");
		} else if (temparature < 73) {
			System.out.println("Getting Warmer");
		} else if (temparature > 101) {
			System.out.println("Very Hot");
		} else {
			System.out.println("Please put a valid temparature");
		}
		scanner.close();

	}

}
