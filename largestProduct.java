package Wipro_Practise;

import java.util.Arrays;

public class largestProduct {

	public static int largestProduct(int[] nums) {

		if (nums.length < 2) {
			throw new IllegalArgumentException("Array must contain mininmum two elements");
		}

		Arrays.sort(nums);

		// product of two largest number
		int product1 = nums[nums.length - 1] * nums[nums.length - 2];
		int product2 = nums[0] * nums[1]; // product of two smallest number

		int max = Math.max(product1, product2);
		return max;
	}

	public static int largestProductNoSort(int[] nums) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i : nums) {
			// Update the two largest numbers
			if (i > max1) {
				max2 = max1;
				max1 = i;
			} else if (i > max2) {
				max2 = i;
			}

			// Update the two smallest numbers
			if (i < min1) {
				min2 = min1;
				min1 = i;

			} else if (i < min2) {
				min2 = i;
			}
		}

		// Calculate the two possible products

		int product1 = max1 * max2;
		int product2 = min1 * min2;

		// Return the maximum of the two products
		return Math.max(product1, product2);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(largestProduct(nums));
		System.out.println(largestProductNoSort(nums));
	}

}
