package hw10Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This dorm method is from College Interface");
	}

	public static void studyRoom() {
		System.out.println("This studyRoom method is from College Interface");
	}

}
