package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentWords {

	public static ArrayList<String> topWords(String[] words, int k) {
		ArrayList<String> result = new ArrayList<>();

		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			pq.add(entry);
		}

		for (int i = 0; i < k; i++) {
			result.add(0, pq.poll().getKey());
		}
		return result;

	}
	
	public static void main(String[] args) {
		String[] words = {"ate" , "eat" , "eat"};
		int k = 1;
		System.out.println(topWords(words, k));
	}

}
