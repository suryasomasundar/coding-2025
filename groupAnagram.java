package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class groupAnagram {
	//https://www.youtube.com/watch?v=ptgykfAEax8
	
	public static ArrayList<ArrayList<String>> groupanagram(String[] str){
		
		ArrayList<ArrayList<String>> groupedAnagram = new ArrayList<>();
		
		HashMap<String, ArrayList<String>> map = new HashMap();
		
		for (String current : str) {
			char[] characters = current.toCharArray();
			
			Arrays.sort(characters);
			String sorted = new String(characters);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(current);
		
		}
		
		groupedAnagram.addAll(map.values());
		return groupedAnagram;
	}
	
	public static void main(String[] args) {
		String[] str = {"eat", "ate", "tea", "tan", "boy"};
		System.out.println(groupanagram(str));
	}

}
