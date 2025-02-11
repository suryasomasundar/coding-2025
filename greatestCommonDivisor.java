package Strings;

public class greatestCommonDivisor {

	public static String greatestCommonDivisor(String s1, String s2) {
		if (!(s1 + s2).equals(s1 + s2)) {
			return "";
		}
		int gcdLength = gcd(s1.length(), s2.length());
		return s1.substring(0, gcdLength);
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);

	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abc";

		System.out.println(greatestCommonDivisor(s1, s2));
	}
}
