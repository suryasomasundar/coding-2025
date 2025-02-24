package topInterviewMedium;

public class IncreasingTripletSubsequence {

	public static boolean increasingTripletSubsequence(int[] nums) {

		/*
		 * i < j < k and nums[i] < nums[j] < nums[k].
		 * 
		 * First : ; num = 1 1<= first_num so fist_num = 1 Second : nums = 2 2 !<=
		 * first_num but 2<= second_num , so secondnum =2 Third : nums = 3 , 3!<= first,
		 * 3!<= 2, so else true
		 * 
		 */

		if (nums == null || nums.length < 3) {
			return false;
		}

		int first_num = Integer.MAX_VALUE;
		int second_num = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num <= first_num) {
				first_num = num;
			} else if (num <= second_num) {
				second_num = num;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 5, 4, 3, 2, 1 };
		System.out.println(increasingTripletSubsequence(nums));
		System.out.println(increasingTripletSubsequence(nums2));
	}

}
