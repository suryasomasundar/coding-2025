package topInterviewEasy;

import java.util.HashSet;

public class happyNumber {

	/*
	 * Input: n = 19 Output: true Explanation: 12 + 92 = 82 (1 square + 9 square) 82
	 * + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
	 * 
	 * Starting with any positive integer, replace the number by the sum of the
	 * squares of its digits. Repeat the process until the number equals 1 (where it
	 * will stay), or it loops endlessly in a cycle which does not include 1. Those
	 * numbers for which this process ends in 1 are happy.
	 * 
	 */

	public static boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		while (!set.contains(n) && n != 1) {
			set.add(n);
			n = getSumofSquares(n);
		}

		return n == 1;
	}

	public static int getSumofSquares(int num) {
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 19;
		System.out.println(isHappy(n));
	}
}
