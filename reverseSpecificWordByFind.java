package Wipro_Practise;

public class reverseSpecificWordByFind {

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

	public static String reverseSpecificWord(String str, String targetWord) {

		if (str == null || str.isEmpty())
			return str;

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(targetWord)) {
				words[i] = reverseString(words[i]);
			}
		}

		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(word);
			result.append(" ");
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {

		String str = "Hello World Code World";
		String target = "World";
		System.out.println(reverseSpecificWord(str, target));
	}

}
