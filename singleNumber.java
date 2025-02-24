package topInterviewEasy;

import java.util.HashMap;

public class singleNumber {

	/*
	 * 
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space.
	 */

	public static int singleNumber(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int i : nums) {
			if (map.get(i) == 1) {
				return i;
			}
		}
		return 0;
	}

	public static int SingleNumberXor(int[] nums) {

		int result = 0;

		for (int i : nums) {
			result ^= i;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(nums));
		System.out.println(SingleNumberXor(nums));
	}
}



/*
 * 
 * 
 * 
 * 1st - 0 (0000) ^ 4 (0100) = 4 (0100)
Second - 0 (0000) ^ 4 (0100) = 4 (0100)
Third - 5 (0101) ^ 2 (0010) = 7 (0111)
Foruth - 7 (0111) ^ 1 (0001) = 6 (0110)
Fifth - 6 (0110) ^ 2 (0010) = 4 (0100)

 * 
 * 
 * */
 