package Wipro_Practise;

public class reverseSpecificWordByGivingIndex {

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

	public static String reverseSpecificWord(String str, int index) {

		if (str == null || str.isEmpty())
			return str;

		String[] words = str.split(" ");

		// Reverse the specific word
		String reversedWord = reverseString(words[index]);
		words[index] = reversedWord; // Replace the original word with the reversed word

		// Reconstruct the sentence
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(word);
			result.append(" ");
		}

		return result.toString().trim();

	}

	public static void main(String[] args) {
		String str = "Hello World Code Program";
		int index = 1;
		System.out.println(reverseSpecificWord(str, index));
	}

}
