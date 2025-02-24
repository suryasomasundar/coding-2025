package newExercise;

public class selfDivingNumber {

	public static boolean selfDiving(int n) {

		int temp = n;
		while (n != 0) {
			int rem = n % 10;
			if (rem == 0 || temp % rem != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 128;
		System.out.println(selfDiving(n));
	}

}
