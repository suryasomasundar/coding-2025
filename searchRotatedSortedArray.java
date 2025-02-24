package newExercise;

public class searchRotatedSortedArray {

	public static int searchRotated(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2; // Avoid Overflow

			// If target found, return index
			if (nums[mid] == target) {
				return mid;
			}

			// Check which half is sorted

			if (nums[left] <= nums[mid]) { // left half sorted
				if (target >= nums[left] & target < nums[mid]) {
					right = mid - 1; // Search in left half
				} else {
					left = mid + 1; // Search in right half
				}
			} else {
				if (target <= nums[right] & target > nums[mid]) {
					left = mid + 1; // Search in right half
				} else {
					right = mid - 1; // Search in left half
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 }; // Rotated sorted array
		int target = 0;

		int index = searchRotated(nums, target);
		System.out.println("Target found at index: " + index);
	}

}
