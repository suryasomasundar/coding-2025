package newExercise;

import java.util.Arrays;

public class reotateImage {

	public static int[][] rotateImage90(int[][] matrix) {

		int n = matrix.length;

		// Step 1: Transpose the matrix (swap rows and columns)

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// Step 2: Reverse each row of the transposed matrix

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] out = rotateImage90(matrix);
		// Print the rotated matrix

		for (int[] result : out) {
			for (int row : result) {
				System.out.println(row + "");
			}
			System.out.println();
		}

	}
}
