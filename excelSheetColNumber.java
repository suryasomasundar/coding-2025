package topInterviewEasy;

public class excelSheetColNumber {

	/*
	 * 
	 * Given a string columnTitle that represents the column title as appears in an
	 * Excel sheet, return its corresponding column number.
	 * 
	 * For example:
	 * 
	 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ...
	 * 
	 */

	public static int excelTitleToNumber(String columnTitle) {

		int result = 0;

		int n = columnTitle.length();

		for (int i = 0; i < n; i++) {
			result = result * 26;

			result += (columnTitle.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		String columnTitle = "AB";
		System.out.println(excelTitleToNumber(columnTitle));
	}

}


/*Execution:
Initialize result = 0.

Loop through each character:

First Iteration (i = 0):

result = result * 26 → 0 * 26 = 0.

result += (s.charAt(0) - 'A' + 1) → 0 + ('A' - 'A' + 1) = 0 + 1 = 1.

Second Iteration (i = 1):

result = result * 26 → 1 * 26 = 26.

result += (s.charAt(1) - 'A' + 1) → 26 + ('B' - 'A' + 1) = 26 + 2 = 28.

Return result = 28.
 * 
 * 
 * */
