package topInterviewMedium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class findDuplicateNumber {

	/*
	 * Given an array of integers nums containing n + 1 integers where each integer
	 * is in the range [1, n] inclusive.
	 * 
	 * There is only one repeated number in nums, return this repeated number.
	 * 
	 * Example: Input: nums = [1,3,4,2,2] Output: 2
	 */

	public static int removeDuplicateHashMap(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static int removeDuplicateSet(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				return num;
			} else {
				set.add(num);
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		System.out.println(removeDuplicateHashMap(nums));
		System.out.println(removeDuplicateSet(nums));
	}
}
