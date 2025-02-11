package arrays;

public class maxSubArray {

	public static int maxSubarray(int[] nums) {

		int[] table = new int[nums.length];
		int max = nums[0];
		table[0] = max;

		for (int i = 1; i < nums.length; i++) {
			table[i] = Math.max(nums[i], nums[i] + table[i - 1]);
			max = Math.max(max, table[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = {5, 4, 1, 7, 8};
		System.out.println(maxSubarray(nums));
	}
}
