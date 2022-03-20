
public class LazyNumberDetails {

	// Stare
	private int number;
	
	private boolean primeNumber;
	private int primeCache;
	
	private boolean perfectNumber;
	private int perfectCache;
	
	private boolean magicNumber;
	private int magicCache;


	// Constructor
	public LazyNumberDetails(int number) {
		this.number = number;
		
		this.primeNumber = false;
		this.perfectNumber = false;
		this.magicNumber = false;
		
		this.primeCache = -1;
		this.perfectCache = -1;
		this.magicCache = -1;
	}

	//Getter
	public int getNumber() {
		return number;
	}

	public void updateNumber(int number) {
		this.number = number;
		
		this.primeNumber = false;
		this.perfectNumber = false;
		this.magicNumber = false;
		
		this.primeCache = -1;
		this.perfectCache = -1;
		this.magicCache = -1;
	}

	public boolean isPrime(int number) {

		if (primeCache != number) {
			primeCache = number;
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					primeNumber = false;
					return false;
				}
			}
			primeNumber = true;
			return true;
		} else {
			return primeNumber;
		}
	}

	public boolean isPerfect(int number) {
		int sumDivisors = 1;
		if (perfectCache != number) {
			perfectCache = number;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					sumDivisors += i;
				}
			}
			if (sumDivisors == number) {
				perfectNumber = true;
				return true;
			}
			perfectNumber = false;
			return false;
		} else {
			return perfectNumber;
		}
	}

	public int digitsSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public boolean isMagic(int number) {
		if (magicCache != number) {
			magicCache = number;
			while (number >= 10) {
				number = digitsSum(number);
			}
			if (number == 3 || number == 7 || number == 9) {
				magicNumber = true;
			}
			magicNumber = false;
			return number == 3 || number == 7 || number == 9;
		} else {
			return magicNumber;
		}
	}
}
