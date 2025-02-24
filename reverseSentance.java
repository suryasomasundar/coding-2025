package Wipro_Practise;

public class reverseSentance {

	public static String reverseSentance(String str) {

		if (str == null || str.isEmpty())
			return str;

		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			result.append(" ");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String sentance = "This is a code";
		System.out.println(reverseSentance(sentance));
	}

}
