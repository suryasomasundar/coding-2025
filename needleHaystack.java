package topInterviewEasy;

public class needleHaystack {

	/*
	 * Given two strings needle and haystack, return the index of the first
	 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 * 
	 * Example 1:
	 * 
	 * Input: haystack = "sadbutsad", needle = "sad" Output: 0 Explanation: "sad"
	 * occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
	 * Example 2:
	 * 
	 * Input: haystack = "leetcode", needle = "leeto" Output: -1 Explanation:
	 * "leeto" did not occur in "leetcode", so we return -1.
	 * 
	 * 
	 * 
	 */

	public static int returnFirstIndex(String haystack, String needle) {

		int m = haystack.length(); // hello [5] m-n = 3
		int n = needle.length(); // ll [2]
		
		// Edge case: If needle is an empty string, return 0
        if (n == 0) {
            return 0;
        }

        // If needle is longer than haystack, it cannot be found
        if (n > m) {
            return -1;
        }

		// If needle is longer than haystack (m > n), it’s impossible for needle to be
		// in haystack, so the loop doesn’t run.

		// If needle is shorter than or equal to haystack, the loop checks all possible
		// starting positions where needle could fit in haystack.

		// outerLoop
		for (int windowStart = 0; windowStart <= m - n; windowStart++) {
			// This loop compares each character of needle with the corresponding character
			// in haystack starting from the current windowStart.
			for (int i = 0; i < n; i++) {

				// This checks if the current character of needle (needle.charAt(i)) matches the
				// corresponding character in haystack (haystack.charAt(windowStart + i)).

				// If they don’t match, the inner loop breaks, and the outer loop moves to the
				// next starting position (windowStart + 1).

				if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
					break;
				}

				// If the inner loop completes without breaking (i == m - 1), it means all
				// characters of needle match the corresponding characters in haystack starting
				// from windowStart.
				if (i == n - 1) {
					return windowStart;
				}

			}

		}
		return -1;
	}

	public static void main(String[] args) {
		String hayStack = "hello";
		String needle = "ll";
		System.out.println(returnFirstIndex(hayStack, needle));
	}

}


/** Example
 *  hayStack = "hello" m = 5
 *  needle = "ll" n = 2
 *  
 *  m-n = 5-2 = 3
 *  
 *  windowStart =0 need[0] = 'l' hay[0] = 'h' not equal break;
 *  windowStart =1 need[0] = '1' hay[1] = 'e' not equal break;
 *  windowStart =2 i =0; need[0] = 'l' hay[2] = 'l' equal (inner loop kicks in)
 *  		       i =1  need[1] = 'l' hay[3] = 'l' equal 
 *  
 *  i == n -1 (2-1) ==1 
 *  return windowStart =2;
 * 
 * 
 * 
 */
