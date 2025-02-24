package math;

public class perfectNumber {

	public static boolean isPerfectNumber(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("n has to be a positive integer");

		int sum = 1; // Start with 1 as it is divisor of every number

		for (int i = 2; i <= Math.sqrt(n); i++) { // Iterate up to sqrt(n)
			if (n % i == 0) {
				sum += i; // Add the divisor
				if (i != n / i) { // Add the complementary divisor (if different)
					sum += n / i;
				}
			}
		}

		return sum == n && n != 1; // 1 is not a perfect number
	}

	public static void main(String[] args) {
		int n = 28;
		System.out.println(isPerfectNumber(n));

	}

}
