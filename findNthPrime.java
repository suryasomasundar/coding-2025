package arrays;

public class findNthPrime {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int nthPrime(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n should to be a Postive Integer");
		}

		int count = 0;
		int num = 2;

		while (count < n) {
			if (isPrime(num)) {
				count++;
			}

			if (count < n) {
				num++;
			}
		}

		return num;
	}

	public static void main(String args[]) {
		int n = -2;
		System.out.println(nthPrime(n));
	}

}
