package math;

public class palindromeNumber {

	/*
	 * Example 1:
	 * 
	 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
	 * and from right to left. Example 2:
	 * 
	 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
	 * From right to left, it becomes 121-. Therefore it is not a palindrome.
	 * Example 3:
	 * 
	 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
	 * Therefore it is not a palindrome.
	 * 
	 * 
	 */

	
	
	
	
	public static int reverseInt(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;

			rev = rev * 10 + pop;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int n = 1213;
		int reversed = reverseInt(n);
		System.out.println("Original Number " + n);
		System.out.println("Reversed Number " + reversed);
		
		if(reversed == n) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
