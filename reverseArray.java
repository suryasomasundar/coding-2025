package arrays;

public class reverseArray {
	
	public static void reverse(int [] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start ++ ;
			end -- ;
		}
	}
	
	public static void main (String [] args) {
		int[] nums = {1,2,3,4,5,6,7};
		reverse(nums,0, nums.length-1);
		for(int results : nums) {
			System.out.println(results + "");
		}
	}

}
