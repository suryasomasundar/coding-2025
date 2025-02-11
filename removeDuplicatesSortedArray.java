package arrays;

public class removeDuplicatesSortedArray {

	public static int[] removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return new int[] { nums[i - 1], nums[i] };
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int[] result = removeDuplicates(nums);
		for(int results : result) {
			System.out.println(results + "");
		}
	}

}
