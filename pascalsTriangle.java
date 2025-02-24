package topInterviewEasy;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
	public static List<List<Integer>> pascalsTriangle(int numRows) {

		List<List<Integer>> result = new ArrayList<>();

		// First row is always [1]
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		result.add(firstRow);

		for (int rowNum = 1; rowNum < numRows; rowNum++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = result.get(rowNum - 1);

			// First row element is always 1
			row.add(1);

			// Each triangle element (other than the first and last of each row)
			// is equal to the sum of the elements above-and-to-the-left and
			// above-and-to-the-right.
			for (int j = 1; j < rowNum; j++) {
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}

			// Last row element is always 1
			row.add(1);

			// Add the current row to the result
			result.add(row);

		}
		return result;

	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(pascalsTriangle(n));
	}

}
