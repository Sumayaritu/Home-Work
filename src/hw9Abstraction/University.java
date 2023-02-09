package hw9Abstraction;
/*Only one keyword 'Extend' is used for the inheritance in Interface,
An Interface can Inherit other Interfaces,
An Interface can Inherit other Interfaces as many time as it wants
 An Interface can not Inherit a regular class or an abstract class by extends keyword.
 */

public interface University extends College, Hospital {

	public void playGround();

	public void teacher();

//Interface cannot have Constructors

	public default void gymnasioum() {
		System.out.println("This gymnasioum method is from University Interface");
	}

	public static void library() {
		System.out.println("This library method is from University Interface");
	}


	
	
	
	
	

}
