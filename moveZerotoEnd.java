package newExercise;

import java.util.Arrays;

public class moveZerotoEnd {

	public static int[] moveZeros(int[] nums) {

		int temp;
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) { // Check for non-zero elements
				// if(nums[i] == 0 // Make the zero element at the front
				if (i != j) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
				j++;
			}
		}
		return nums;
	}

	public static int[] moveZero(int[] nums) {

		int index = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				nums[index] = nums[j];
				index++;
			}
			
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		return nums;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 0, 5 };
		int[] out = moveZero(nums);
		for (int result : out) {
			System.out.println(result + "");
		}
	}

}

/*
 * Example Walkthrough: For nums = {0, 1, 3, 0, 5}:
 * 
 * Iteration 1: i = 0, nums[0] = 0 → Skip.
 * 
 * Iteration 2: i = 1, nums[1] = 1 → Swap with nums[0]. Array becomes {1, 0, 3,
 * 0, 5}. Increment j.
 * 
 * Iteration 3: i = 2, nums[2] = 3 → Swap with nums[1]. Array becomes {1, 3, 0,
 * 0, 5}. Increment j.
 * 
 * Iteration 4: i = 3, nums[3] = 0 → Skip.
 * 
 * Iteration 5: i = 4, nums[4] = 5 → Swap with nums[2]. Array becomes {1, 3, 5,
 * 0, 0}. Increment j.
 * 
 * Final output: 1 3 5 0 0.
 * 
 * 
 */
