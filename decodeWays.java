package topInterviewMedium;

public class decodeWays {

	public static int decodeWay(String str) {

		// Edge case: If the string is empty, return 0
		if (str == null || str.length() == 0) {
			return 0;
		}

		int[] dp = new int[str.length() + 1];

		// Base case: There is 1 way to decode an empty string
		dp[0] = 1;
		
		// Base case: If the first character is '0', there are 0 ways to decode it
		dp[1] = str.charAt(0) == '0' ? 0 : 1;

		for (int i = 2; i <= str.length(); i++) {
			int oneDigit = Integer.valueOf(str.substring(i - 1, i));
			int twoDigit = Integer.valueOf(str.substring(i - 2, i));

			if (oneDigit >= 1) {
				dp[i] += dp[i - 1];
			}

			if (twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[str.length()];
	}

	public static void main(String[] args) {
		String str = "226";
		System.out.println(decodeWay(str));
	}

}
