package math;

public class powerofTwo {

	public static boolean powerTwo(int n) {

		if (n <= 0)
			throw new IllegalArgumentException("n has to be a Positive Integer");

		if (n == 1)
			return true;

		while (n > 1) {
			if (n % 2 != 0) { // reminder If n is not divisible by 2, it's not a power of two
				return false;

			} else {
				n = n / 2; // Quotient - Divide n by 2 and continue
			}

		}
		return true;

	}

	public static void main(String[] args) {
		int n = 16;
		System.out.println(powerTwo(n));
	}

}
