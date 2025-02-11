package Strings;

public class validPalindrome {

	public static boolean isValidPalindrome(String str) {

		String fixed_string = "";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				fixed_string += c;
			}
		}

		fixed_string = fixed_string.toLowerCase();

		int low = 0;
		int high = fixed_string.length() - 1;

		while (low < high) {
			if (fixed_string.charAt(low) != fixed_string.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;

	}
	
	public static void main (String [] args) {
		String str = "122";
		System.out.println(isValidPalindrome(str));
	}

}
