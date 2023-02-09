package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		// default Constructor initialized
		Computer computer = new Computer();

		// Parameterized Constructor initialized
		Computer computer1 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);

		System.out.println("---------------------------------------------");

		// My Configuration
		Computer computer2 = new Computer("Windows", "Lenovo Flex 5", "Windows 11", 850, 'D', true);

	}

}
