package topInterviewEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersection2 {

	public static int[] findIntersection(int[] nums1, int[] nums2) {

		List<Integer> result = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println("Nums1 Map --> " + map);

		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				result.add(num);
				map.put(num, map.getOrDefault(num, 0) - 1);
			}
		}
		System.out.println("Nums2 Map --> " + map);

		int[] output = new int[result.size()];
		for (int i = 0; i < output.length; i++) {
			output[i] = result.get(i);
		}

		return output;

	}
	
	public static void main(String[] args) {
		int[] num1 = {1,2,2,1};
		int[] num2 = {2,2};
		int[] out = findIntersection(num1, num2);
		for(int output : out) {
			System.out.println(output + "");
		}
		
		
	}

}
