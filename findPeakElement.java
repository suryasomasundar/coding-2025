package topInterviewMedium;

public class findPeakElement {

	public static int peakElement(int[] nums) {

		/*
		 * Execution: Initial State: nums = [1, 2, 3, 1];
		 * 
		 * left = 0, right = 3.
		 * 
		 * Iteration 1:
		 * 
		 * mid = 0 + (3 - 0) / 2 = 1.
		 * 
		 * nums[1] = 2, nums[2] = 3.
		 * 
		 * Since nums[mid] < nums[mid + 1], set left = mid + 1 = 2.
		 * 
		 * Iteration 2:
		 * 
		 * left = 2, right = 3.
		 * 
		 * mid = 2 + (3 - 2) / 2 = 2.
		 * 
		 * nums[2] = 3, nums[3] = 1.
		 * 
		 * Since nums[mid] > nums[mid + 1], set right = mid = 2.
		 * 
		 * Loop Ends:
		 * 
		 * left = 2, right = 2.
		 * 
		 * Return left = 2.
		 * 
		 * 
		 */

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2; // Avoid overflow
			if (nums[mid] > nums[mid + 1]) {
				// Peak is on the left side (including mid)
				right = mid;
			} else {
				// // Peak is on the right side (excluding mid)
				left = mid + 1;
			}
		}
		// When left == right, we've found a peak
		return left;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(peakElement(nums));
	}

}
