package newExercise;

public class validPalindromeii {

	public static boolean isValidPalindrome(String str) {

		int low = 0;
		int high = str.length() - 1;

		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return helperMethod(str, low + 1, high) || helperMethod(str, low, high - 1);
			}
			low++;
			high--;
		}
		return true;
	}

	public static boolean helperMethod(String str, int i, int j) {

		int low = i;
		int high = j;

		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(isValidPalindrome(str));
	}

}
