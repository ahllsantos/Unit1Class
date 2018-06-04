
public class Loops {

	public static void main(String[] args) {
		//// NESTED LOOPS (loops in loops)
		int x,y;
		for (x = 0; x < 8; x++) {
			System.out.print(x);
			for (y = 0; y < 8; y++)
				System.out.print(y);
			System.out.println();
		}
	}
	
	public static void whileLoop() {
		/////// WHILE LOOP
		boolean gameOver = true;
		while (!gameOver)
			; // the game is happening....
	}
	
	public static void forLoop() {
		/////// FOR LOOP
		int i;
		for (i = 0; i < 1000000;i++)
			;
		System.out.println("Done");
	}
	
	public static void forEachLoopExample() {
		int[] primes = {2,3,5,7,11};
		for (int p : primes) // nextPrime is our variable; primes is our array
			System.out.println(p);
		System.out.println("The program continues....");
	}

}

