package topInterviewMedium;

public class maxProductSubArray {

	/*
	 * Given an integer array nums, find a subarray that has the largest product,
	 * and return the product.
	 * 
	 * nums = [2, 3, -2, 4];
	 * 
	 * Initialize: maxProduct = 2, minProduct = 2, result = 2.
	 * 
	 * i = 1 (3): maxProduct = max(3, 2 * 3) = 6.
	 * 
	 * minProduct = min(3, 2 * 3) = 3.
	 * 
	 * result = max(2, 6) = 6
	 * 
	 * i = 2 (-2):
	 * 
	 * Swap maxProduct and minProduct (since -2 is negative):
	 * 
	 * maxProduct = 3, minProduct = 6.
	 * 
	 * maxProduct = max(-2, 3 * -2) = -2.
	 * 
	 * minProduct = min(-2, 6 * -2) = -12.
	 * 
	 * result = max(6, -2) = 6.
	 * 
	 * i = 3 (4):
	 * 
	 * maxProduct = max(4, -2 * 4) = 4.
	 * 
	 * minProduct = min(4, -12 * 4) = -48.
	 * 
	 * result = max(6, 4) = 6.
	 * 
	 */

	public static int maxProdutSubArray(int[] nums) {

		if (nums.length == 0)
			return 0;

		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < 0) {
				// If the current number is negative, swap maxProduct and minProduct
				int temp = maxProduct;
				maxProduct = minProduct;
				minProduct = temp;

			}

			// Update maxProduct and minProduct for the current number
			maxProduct = Math.max(nums[i], maxProduct * nums[i]);
			minProduct = Math.min(nums[i], minProduct * nums[i]);

			// Update the result with the maximum product found so far
			result = Math.max(result, maxProduct);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		int[] nums2 = { -2, 0, -1 };
		System.out.println(maxProdutSubArray(nums));
		System.out.println(maxProdutSubArray(nums2));
	}

}
