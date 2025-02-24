package Wipro_Practise;

public class addElementMatrix {

	public static int addMatrix(int[][] matrix) {

		// Handle empty matrix
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException("Matrix is Empty");
		}

		int sum = 0;

		// Iterate through each row
		for (int[] row : matrix) {
			// Iterate through each element in the row
			for (int element : row) {
				sum += element;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(addMatrix(matrix));
		;
	}

}
