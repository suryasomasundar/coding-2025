package topInterviewEasy;

import java.util.Arrays;

public class validAnagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "anagram", t = "nagaram"
	 * 
	 * Output: true
	 * 
	 */

	public static boolean isAnagram(String s1, String s2) {

		char[] strArray1 = s1.toCharArray();
		char[] strArray2 = s2.toCharArray();

		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		return Arrays.equals(strArray1, strArray2);

	}

	public static boolean isAnagramnoSort(String s1, String s2) {

		int[] counter = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			counter[s1.charAt(i) - 'a']++;
			counter[s2.charAt(i) - 'a']--;
		}

		for (int count : counter) {
			if (count != 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.println(isAnagram(s1, s2));
		System.out.println(isAnagramnoSort(s1, s2));
	}
}
