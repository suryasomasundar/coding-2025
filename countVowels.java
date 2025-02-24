package Wipro_Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class countVowels {

	public static int countVowels(String str) {

		int count = 0;
		String modified = str.toLowerCase();

		for (char c : modified.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;

	}

	public static int countVowels2(String str) {
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');

		int count = 0;
		String modified = str.toLowerCase();
		for (char c : modified.toCharArray()) {
			if (set.contains(c)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String str = "aabbcceeiioouu";
		System.out.println(countVowels(str));
		System.out.println(countVowels2(str));
	}

}
