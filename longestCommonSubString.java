package newExercise;

public class longestCommonSubString {

	public static int lcsDynamic(char[] str1, char[] str2) {

		int[][] temp = new int[str1.length + 1][str2.length + 1];
		int max = 0;

		for (int i = 1; i < str1.length; i++) {
			for (int j = 1; j < str2.length; j++) {
				if (str1[i - 1] == str2[j - 1]) {
					temp[i][j] = temp[i - 1][j - 1] + 1;
				}
				if (max < temp[i][j]) {
					max = temp[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String s1 = "abcdaf";
		String s2 = "zbcdf";

		System.out.println(lcsDynamic(s1.toCharArray(), s2.toCharArray()));
	}

}
