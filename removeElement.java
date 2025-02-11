package arrays;

public class removeElement {

	public static int[] removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return new int[] { nums[i - 1], nums[i] };
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int[] result = removeElement(nums, val);
		for (int results : result) {
			System.out.println(results + "");
		}
	}

}
