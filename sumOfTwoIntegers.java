package topInterviewMedium;

public class sumOfTwoIntegers {

	/*
	 * Given two integers a and b, return the sum of the two integers without using
	 * the operators + and -.
	 * 
	 * Example: Input: a = 1, b = 2 Output: 3
	 * 
	 * 
	 * Logic Explained
	 * 
	 * And Operation XOR Operation
	 * 
	 * 1 0 = 0 1 0 = 1 0 1 = 0 0 1 = 1 1 1 = 1 1 1 = 0 0 0 = 0 0 0 = 0
	 * 
	 * << Left Operation , add 1 to the output
	 * 
	 * a = 5 (0100) , b = 3 (0011)
	 * 
	 * carry = 0101 & 0011 = 0001 << 1 = 0010 ( 2) a = 0101 ^ 0011 = 0110 = 6 b =
	 * carry = 2
	 * 
	 * 
	 * Keep doing until b !=0 return a
	 * 
	 * b = 2 1 = 6 carry = 6 & 2 = 0110 & 0010 = 0010 <<1 = 0100 = 4 a = 0110 ^ 0010
	 * = 0100 = 4 b = carry = 4
	 * 
	 * b = 4, a = 4 carry = 0100 & 0100 = 0100 << 1 = 1000 = 8 a = 0100 ^ 0100 =
	 * 0000 b = carry = 8
	 * 
	 * a =0. b =8 carry = 0000 & 1000 = 1000 << 1 = 0000 = 0 a = 0000 & 1000 = 1000
	 * = 8 b = 0 return a = 8
	 */

	public static int sumOfIntegers(int a, int b) {
		return a + b;
	}

	public static int sumofIntegersBetter(int a, int b) {

		while (b != 0) {
			int carry = (a & b) << 1;
			a = a ^ b;
			b = carry;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(sumOfIntegers(5, 3));
		System.out.println(sumofIntegersBetter(5, 3));
	}
}
