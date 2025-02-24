package newExercise;

public class longestCommonSubsequence {

	public static int lcsDynamic(char[] str1, char[] str2) {

		int[][] temp = new int[str1.length + 1][str2.length + 1];
		int max = 0;

		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[i].length; j++) {
				if (str1[i - 1] == str2[j - 1]) {
					temp[i][j] = temp[i - 1][j - 1] + 1; // Characters match, increment LCS length
				} else {
					temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]); //  Characters don't match, take the maximum of top or left cell
				}

				if (temp[i][j] > max) {
					max = temp[i][j];
				}

			}
		}
		return max;
	}

	public static void main(String[] args) {
		String s1 = "abcdaf";
		String s2 = "acbcf";
		System.out.println(lcsDynamic(s1.toCharArray(), s2.toCharArray()));
	}

}


/*Example Walkthrough:
For str1 = "abcdaf" and str2 = "acbcf":

The DP table is filled as follows:

a	c	b	c	f
0	0	0	0	0	0
a	0	1	1	1	1	1
b	0	1	1	2	2	2
c	0	1	2	2	3	3
d	0	1	2	2	3	3
a	0	1	2	2	3	3
f	0	1	2	2	3	4
The LCS length is 4, and the LCS string is "abcf".
 * 
 * */

