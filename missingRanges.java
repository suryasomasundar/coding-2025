package topInterviewEasy;

import java.util.ArrayList;
import java.util.List;

public class missingRanges {

	/*
	 * You are given an inclusive range [lower, upper] and a sorted unique integer
	 * array nums, where all elements are within the inclusive range.
	 * 
	 * A number x is considered missing if x is in the range [lower, upper] and x is
	 * not in nums.
	 * 
	 * Example -1
	 * 
	 * Input: nums = [0,1,3,50,75], lower = 0, upper = 99 Output:
	 * [[2,2],[4,49],[51,74],[76,99]] Explanation: The ranges are: [2,2] [4,49]
	 * [51,74] [76,99]
	 * 
	 */

	public static List<List<Integer>> findMissingRange(int[] nums, int lower, int upper) {

		List<List<Integer>> result = new ArrayList<>();

		// Iterate through the nums array
		for (int num : nums) {
			// If the current number is greater than lower, there is a missing range
			if (num > lower) {
				result.add(createRange(lower, num - 1));
			}
			// Update lower to num + 1
			lower = num + 1;
		}

		// After processing all numbers, check if there is a missing range between the
		// last number and upper
		if (lower <= upper) {
			result.add(createRange(lower, upper));
		}

		return result;
	}

	public static List<Integer> createRange(int lower, int upper) {
		List<Integer> range = new ArrayList<>();
		range.add(lower);
		range.add(upper);
		return range;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 50, 75 };
		int lower = 0;
		int upper = 99;
		List<List<Integer>> result = findMissingRange(nums, lower, upper);
		System.out.println(result);
	}

}
