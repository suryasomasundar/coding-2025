package newExercise;

public class isSubsequence {

	public static boolean isSubSequence(String s1, String s2) {

		int left = s1.length();
		int right = s2.length();
		int leftPointer = 0;
		int rightPointer = 0;

		while (leftPointer < left && rightPointer < right) {
			if (s1.charAt(leftPointer) == s2.charAt(rightPointer)) {
				leftPointer++;
			} else {
				rightPointer++;
			}
		}
		return leftPointer == left;
	}

	public static void main(String[] args) {
		String S1 = "AXY";
		String S2 = "ADXCPY";

		System.out.println(isSubSequence(S1, S2));
	}

}

/*
 * For S1 = "AXY" and S2 = "ADXCPY":
 * 
 * A in S1 matches A in S2 → increment both pointers.
 * 
 * X in S1 matches X in S2 → increment both pointers.
 * 
 * Y in S1 matches Y in S2 → increment both pointers.
 * 
 * At the end, leftPointer == left (3 == 3), so true is returned.
 * 
 */
