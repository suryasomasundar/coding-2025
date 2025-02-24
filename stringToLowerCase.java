package newExercise;

public class stringToLowerCase {

	public static String convertLowerCaseFunction(String str) {
		return str.toLowerCase();

	}

	public static String convertLowerCase(String str) {

		String result = "";

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				result = result + (char) (c + 32); // lowercase by adding 32 to its ASCII value.
			} else {
				result += c;
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		
		System.out.println(convertLowerCase(str));
	}

}
