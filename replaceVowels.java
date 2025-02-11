package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class replaceVowels {

	public static String replaceVowels(String str) {

		return str.replaceAll("[aeiou]", "");
	}

	public static String replaceVowelsStringBuff(String str) {

		StringBuffer sb = new StringBuffer();

		HashSet<String> set = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		for (char c : str.toCharArray()) {
			if (!set.contains(c)) {
				sb.append(c);
			}
		}
		return sb.toString();

	}
	
	public static void main(String[] args) {
		String str = "Vowels";
		System.out.println(replaceVowels(str));
		System.out.println(replaceVowelsStringBuff(str));
		
	}

}
