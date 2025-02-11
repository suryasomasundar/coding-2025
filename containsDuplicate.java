package arrays;

import java.util.HashSet;

public class containsDuplicate {

	public static boolean IsArrayContainsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			} else {
				set.add(i);
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 1 };
		System.out.println(IsArrayContainsDuplicate(nums));

	}

}
