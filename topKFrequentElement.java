package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElement {

	public static int[] topKElement(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		// Letting queue to add values from high to low
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

		for (Map.Entry entry : map.entrySet()) {
			pq.add(entry);
		}

		int[] output = new int[k];
		for (int i = 0; i < k; i++) {
			output[i] = pq.poll().getKey();
		}
		return output;

	}
	
	public static void main (String[] args) {
		int[] nums = { 3, 1, 4, 4, 5, 2, 6, 1 };
		int k = 2;
		int[] results = topKElement(nums, k);
		for(int result: results) {
			System.out.println(result + "");
		}
	}
}
