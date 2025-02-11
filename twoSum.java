package arrays;

import java.util.HashMap;

public class twoSum {

	public static int[] twoSumClassic(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int complement = target - nums[i];
				if (nums[j] == complement);
				return new int[] { nums[i], nums[j] };
			}
		}
		throw new IllegalArgumentException("No Match Found");
	}
	
	
	public static int[] twoSumHash(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {nums[i] , complement};
			}else {
				map.put(nums[i], nums[i]);
			}
		}
		throw new IllegalArgumentException("No Match Found");
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int target = 7;
		int[] result = twoSumHash(nums, target);
		for(int results : result) {
			System.out.println(results + " ");
		}
	}

}
