package math;

public class missingNumber {

	/*
	 * 
	 * Input: nums = [3,0,1]
	 * 
	 * Output: 2
	 * 
	 * Input: nums = [0,1]
	 * 
	 * Output: 2
	 * 
	 * Input: nums = [9,6,4,2,3,5,7,0,1]
	 * 
	 * Output: 8
	 * 
	 */

	public static int missingNumber(int[] nums) {

		int n = nums.length;

		int expectedSum = (n * (n + 1) / 2);
		int actualSum = 0;

		for (int i = 0; i < n; i++) {
			actualSum += nums[i];

		}

		int missingNumber = expectedSum - actualSum;
		return missingNumber;
	}
	
	public static void main(String[] args) {
		int [] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}

}
