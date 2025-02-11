package Strings;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingChar {
	
	// Sliding Window Algorithm - https://www.youtube.com/watch?v=4i6-9IzQHwo
	
	public static int longetSubString(String str) {
		if(str == null || str.length() == 0) return 0;
		int i =0; 
		int j= 0; 
		int max = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(i< str.length()) {
			char c = str.charAt(i);
			while(set.contains(c)) {
				set.remove(str.charAt(j));
				j++;
			}
			set.add(c);
			max = Math.max(max, i-j+1);
			i++;
		}
		return max;
	}
	
	public static void main (String[] args) {
		String str = "PWWKEW";
		System.out.println(longetSubString(str));
	}

}
