package math;

public class plauOne {

	/*
	 * Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the
	 * integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should
	 * be [1,2,4].
	 * 
	 * Input: digits = [4,3,2,1] Output: [4,3,2,2]
	 * 
	 * Input: digits = [9] Output: [1,0]
	 */

	/*
	 * Explanation
	 * 
	 * Link - https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/
	 * 
	 *
	 */

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

	}

	public static void main(String[] args) {
		int[] digits = { 9, 9, 1 };
		int[] result = plusOne(digits);
		for (int results : result) {
			System.out.println(results + "");
		}

	}

}
