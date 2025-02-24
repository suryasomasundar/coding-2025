package math;

public class powerofFour {

	public static boolean powerofFour(int n) {

		if (n == 1)
			return true;
		if (n <= 0)
			throw new IllegalArgumentException("n has to be a postivie Integer");

		while (n > 1) {
			if (n % 4 != 0) { // reminder
				return false;
			} else {
				n = n / 4; // Quotient
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(powerofFour(n));
	}
}
