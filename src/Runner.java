import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		LazyNumberDetails lnd = new LazyNumberDetails(12);
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("Ce operatiune doriti sa executati? (Prim/Perfect/Magic).");
		String choice = sc.next();
		do {
			if (lnd.getNumber() >= 0) {
				if (choice.equalsIgnoreCase("prim")) {
					System.out.println("Numarul " + lnd.getNumber() + " este prim? " + lnd.isPrime(lnd.getNumber()));
				} else if (choice.equalsIgnoreCase("perfect")) {
					System.out.println("Numarul " + lnd.getNumber() + " este perfect? " + lnd.isPerfect(lnd.getNumber()));
				} else if (choice.equalsIgnoreCase("magic")) {
					System.out.println("Numarul " + lnd.getNumber() + "  este magic? " + lnd.isMagic(lnd.getNumber()));
				} else {
					System.out.println("Ati introdus o operatiune invalida.");
				}
				System.out.println("Doriti sa executati alta operatie pentru acest numar? (Prim/Perfect/Magic/Nu)");
				choice = sc.next();
			}
		} while (!choice.equalsIgnoreCase("nu"));
*/
	/*	// Prime number nano time
		long start1 = System.nanoTime();
		boolean result1 = lnd.isPrime(lnd.getNumber());
		long end1 = System.nanoTime();
		System.out.println("Prime number:");
		System.out.println("First: " + (end1 - start1));

		long start2 = System.nanoTime();
		boolean result2 = lnd.isPrime(lnd.getNumber());
		long end2 = System.nanoTime();
		System.out.println("Second: " + (end2 - start2));

		// Perfect number nano time
		System.out.println();
		long start3 = System.nanoTime();
		boolean result3 = lnd.isPerfect(lnd.getNumber());
		long end3 = System.nanoTime();
		System.out.println("Perfect number:");
		System.out.println("First: " + (end3 - start3));

		long start4 = System.nanoTime();
		boolean result4 = lnd.isPerfect(lnd.getNumber());
		long end4 = System.nanoTime();
		System.out.println("Second: " + (end4 - start4));

		// Magic number nano time
		System.out.println();
		long start5 = System.nanoTime();
		boolean result5 = lnd.isMagic(lnd.getNumber());
		long end5 = System.nanoTime();
		System.out.println("Magic number:");
		System.out.println("First: " + (end5 - start5));

		long start6 = System.nanoTime();
		boolean result6 = lnd.isMagic(lnd.getNumber());
		long end6 = System.nanoTime();
		System.out.println("Second: " + (end6 - start6));
*/
		
		System.out.println(lnd.isPrime(1_000_000_009));
		System.out.println(lnd.isPrime(12));		
		
		
		sc.close();
	}

}
