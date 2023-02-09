package hw10Abstraction;

public interface Hospital {

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This morgue method is from Hospital Interface");
	}

	public static void pharmacy() {
		System.out.println("This pharmacy method is from Hospital Interface");
	}


}
