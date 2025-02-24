package topInterviewMedium;

public class perfectSquares {

	// Helper method to check is a number is a perfect square
	public boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}

	// Main method to find the minimum number of perfect squares
	public int numSquares(int n) {
		// Case 1: If n is a perfect square, return 1
		if (isPerfectSquare(n)) {
			return 1;
		}

		// Case 2: Check if n can be expressed as the sum of two perfect squares

		for (int i = 1; i <= n; i++) {
			if (isPerfectSquare(n - i * i)) {
				return 2;
			}
		}

		// Case 3: Check if n is of the form 4^a(8b + 7) (requires four squares)

		while (n % 4 == 0) {
			n /= 4;
		}
		if (n % 8 == 7) {
			return 4;
		}

		// Case 4: Default to three squares
		return 3;

	}

}
