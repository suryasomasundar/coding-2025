package topInterviewEasy;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		int result = 0;

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > n / 2) {
				System.out.println("Majority Element is -> " + entry.getKey() + " The Count of Occur = " + entry.getValue());
				return result = entry.getKey();

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		int[] nums2 = {2,2,1,1,1,2,2};
		int[] nums3 = {1,2,3,4};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement(nums2));
		System.out.println(majorityElement(nums3));
	}

}
