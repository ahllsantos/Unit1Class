public class Decisions {
	final static int MIDWESTERN = 1;
	final static int CALIFORNIAN = 2;
	final static int FRENCH = 3;
	
	public static void main(String[] args) {
		int i = 9;
		int lady = FRENCH;
		
		if (i == 9) {
			if (lady == MIDWESTERN) {
				System.out.println("Bungo!");
				System.out.println("Yippee!!!!!");
			}
			else if (lady == CALIFORNIAN)
				System.out.println("Hah!  I win suckas.");
			else if (lady == FRENCH)
				System.out.println("Oui!!!!");
			else System.out.println("Bungo!");
		}
		else System.out.println("Dang it....");
		
		System.out.println("The next line.");
	}

}

