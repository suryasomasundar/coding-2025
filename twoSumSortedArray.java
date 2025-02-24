package newExercise;

public class twoSumSortedArray {

	public static int[] twoSumSorted(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			int sum = nums[low] + nums[high];

			if (sum == target) {
				return new int[] { low + 1, high + 1 };
			}

			if (sum > target) {
				high--;
			} else {
				low++;
			}
		}
		return new int[] { low + 1, high + 1 };
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] out = twoSumSorted(nums, target);
		for (int result : out) {
			System.out.println(result + "");
		}
	}
}
