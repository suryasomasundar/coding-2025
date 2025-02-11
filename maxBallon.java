package Strings;

public class maxBallon {

	public static int maxBallon(String str) {

		int[] charCount = new int[26];
		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i) - 'a']++;
		}

		int min = charCount['b' - 'a'];
		min = Math.min(min, charCount['a' - 'a']);
		min = Math.min(min, charCount['l' - 'a'] / 2);
		min = Math.min(min, charCount['o' - 'a'] / 2);
		min = Math.min(min, charCount['n' - 'a']);
		return min;
	}

	public static void main(String[] args) {
		String str = "balloonballoon";
		System.out.println(maxBallon(str));
	}
}
