package arrays;

public class reverseInteger {

	public static int reverseInteger(int x) {

		int rev = 0;

		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			rev = rev * 10 + pop;
		}
		return rev;

	}
	
	public static void main (String [] args) {
		int x = 21;
		System.out.println(reverseInteger(x));
	}

}
