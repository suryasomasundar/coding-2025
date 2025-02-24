package math;

public class validPerfectSquare {

	public static boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}

	public static boolean isPerfectSquareWithout(int num) {
		int x = num;
		while (x * x > num) {
			x = (x + num / x) / 2;
		}
		return x * x == num;
	}

	public static boolean isPerfectSquareBinary(int num) {
		int i = 1;
		int j = num;

		while (i < j) {
			int mid = (i + j) / 2;
			if (mid * mid == num)
				return true;
			if (mid * mid < num)
				i = mid + 1;
			if (mid * mid > num)
				j = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 16;
		System.out.println(isPerfectSquare(n));
		System.out.println(isPerfectSquareBinary(n));
	}
}
