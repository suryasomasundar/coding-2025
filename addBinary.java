package Strings;

public class addBinary {

	public static String addBinary(String num1, String num2) {

		StringBuilder result = new StringBuilder();
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;

		while ((i >= 0) || (j >= 0)) {
			int sum = carry;

			if (i >= 0) {
				sum += num1.charAt(i--) - '0';
			}
			if (j >= 0) {
				sum += num2.charAt(j--) - '0';
			}

			result.append(sum % 2);
			carry = sum / 2;

			if (carry != 0) {
				result.append(carry);
			}

		}

		return result.reverse().toString();
	}

	public static void main(String[] args) {
		String num1 = "001";
		String num2 = "010";

		System.out.println(addBinary(num1, num2));

	}
}
