package newExercise;

import java.util.HashSet;

public class longestPalindrome {

	public static int longestPali(String str) {

		// Ref -
		// https://leetcode.com/problems/longest-palindrome/solutions/5255173/faster-less-mem-detailed-approach-set-approach-python-java-c

		HashSet<Character> set = new HashSet<>();

		int length = 0;

		for (char c : str.toCharArray()) {
			if (set.contains(c)) {
				set.remove(c);
				length += 2;

			} else {
				set.add(c);
			}
		}

		
		// If there are any characters left in the set, add 1 to the length for the middle character
		if (!set.isEmpty()) {
			length += 1;
		}
		return length;
	}

	public static void main(String[] args) {
		String str = "abccccdd";
		System.out.println(longestPali(str));
	}

}



/*Step-by-Step Execution:
Initialize:

set = {} (empty HashSet).

length = 0.

Iteration 1:

c = 'a' (not in set).

Add 'a' to set: set = {'a'}.

Iteration 2:

c = 'b' (not in set).

Add 'b' to set: set = {'a', 'b'}.

Iteration 3:

c = 'c' (not in set).

Add 'c' to set: set = {'a', 'b', 'c'}.


Iteration 4:

c = 'c' (already in set).

Remove 'c' from set: set = {'a', 'b'}.

Increment length by 2: length = 2.

Iteration 5:

c = 'c' (not in set).

Add 'c' to set: set = {'a', 'b', 'c'}.

Iteration 6:

c = 'c' (already in set).

Remove 'c' from set: set = {'a', 'b'}.

Increment length by 2: length = 4.


Iteration 7:

c = 'd' (not in set).

Add 'd' to set: set = {'a', 'b', 'd'}.

Iteration 8:

c = 'd' (already in set).

Remove 'd' from set: set = {'a', 'b'}.

Increment length by 2: length = 6.

Final Adjustment:

After processing all characters, set = {'a', 'b'} (not empty).

Add 1 to length for the middle character: length = 7.

Return:

The longest palindrome length is 7.

 * 
 * */
