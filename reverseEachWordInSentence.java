package Wipro_Practise;

public class reverseEachWordInSentence {

	public static String reverseString(String str) {

		char[] strArray = str.toCharArray();

		int start = 0;
		int end = strArray.length - 1;

		while (start < end) {
			char temp = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = temp;
			start++;
			end--;
		}

		return new String(strArray);

	}

	public static String reverseEachWord(String str) {
		if (str == null || str.isEmpty()) {
			return str; // Handle empty or null input
		}

		// Split the sentence into words
		String[] words = str.split(" ");
		String result = "";

		// Reverse each word and append to the result
		for (String word : words) {
			String reversedWord = reverseString(word);
			result += reversedWord + " ";
		}

		// Remove the trailing space and return the result
		return result.trim();
	}

	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println(reverseString(str));
		System.out.println(reverseEachWord(str));
		System.out.println(str);
	}

}
