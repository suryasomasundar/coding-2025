package newExercise;

import java.util.Arrays;

public class movePositivetoRightNegativetoLeft {

	public static int[] moveIntegers(int[] nums) {

		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			// Move low forward if it's even
			while (low < high & nums[low] % 2 == 0) {
				low++;
			}
			while (low < high & nums[high] % 2 == 1) {
				high--;
			}

			// Swap only if low is still less than high
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, -1, -4, 3, -6 };
		int[] out = moveIntegers(nums);
		System.out.println(Arrays.toString(out));
	}

}

/*
 * Initial: nums = [1, 2, -1, -4, 3, -6] low = 0, high = 5 (pointing at first
 * and last elements)
 * 
 * First Iteration (low = 0, high = 5):
 * 
 * nums[low] = 1 (odd), stop incrementing low. nums[high] = -6 (even), stop
 * decrementing high. Swap nums[low] and nums[high] nums = [-6, 2, -1, -4, 3, 1]
 * 
 * Second Iteration (low = 1, high = 4): nums[low] = 2 (even), move low forward:
 * low = 2. nums[high] = 3 (odd), move high backward: high = 3. Swap nums[low]
 * and nums[high] nums = [-6, 2, -4, -1, 3, 1]
 * 
 * Now, low (3) >= high (2), so the loop terminates.
 * 
 * Output nums = [-6, 2, -4, -1, 3, 1]
 * 
 * 
 */
