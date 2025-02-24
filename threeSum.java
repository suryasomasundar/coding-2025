package newExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {

	// Reference - https://www.youtube.com/watch?v=qJSPYnS35SE
	public static List<List<Integer>> threesum(int[] nums) {

		Arrays.sort(nums);

		List<List<Integer>> output = new LinkedList();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1;
				int high = nums.length - 1;
				int sum = 0 - nums[i];

				while (low < high) {
					if (nums[low] + nums[high] == sum) {
						output.add(Arrays.asList(nums[low], nums[high], nums[i]));
						while (low < high && nums[low] == nums[low + 1])
							low++;

						while (low < high && nums[high] == nums[high - 1])
							high--;

						low++;
						high--;
						
					} else if (nums[low] + nums[high] > sum) {
						high--;
					} else {
						low++;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> out = threesum(nums);
		System.out.println(Arrays.asList(out));
	}

}
