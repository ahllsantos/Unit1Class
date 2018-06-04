import java.util.Scanner; //SCANNER: Allows us to use the Scanner class

public class Unit1 {
	private static Scanner scanner; //SCANNER: Declares that there will be a Scanner object
	
	/* To input from the console, be sure you
	 * have the the four lines marked "//SCANNER"
	 * in your code!  
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in); //SCANNER: Creates a Scanner object
		
		//askNameAndAge();		// Runs the code in askNameAndAge()
		forEachLoopExample(); // Runs the code in forEachLoopExample()
		
		scanner.close(); //SCANNER: Closes the scanner object
	}
	
	public static void askNameAndAge() {
		System.out.print("What's your name? ");
		String name = scanner.next();	// .nextLine() also exists
		System.out.println("Hi, " + name + "!");	// Print something out
		
		System.out.print("What's your age? ");
		int age  = scanner.nextInt();
		System.out.println("Wow, you are " + age + " years old?");
		System.out.println("I was just born yesterday!");
	}
	
	public static void forEachLoopExample() {
		int[] primes = {2,3,5,7,11};
		for (int p : primes) // nextPrime is our variable; primes is our array
			System.out.println(p);
		System.out.println("The program continues....");
	}
}









