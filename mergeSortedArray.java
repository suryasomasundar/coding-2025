package newExercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSortedArray {

	public static int[] mergeArray(int[] num1, int[] num2, int m, int n) {

		// Check for edge cases
		if (num1 == null || num2 == null) {
			throw new IllegalArgumentException("Input arrays cannot be null.");
		}

		if (num1.length < m + n) {
			throw new IllegalArgumentException("num1 array does not have enough space to hold the merged result.");
		}

		int i = m - 1; // Pointer for num1
		int j = n - 1; // Pointer for num2
		int k = m + n - 1; // Pointer for the end of the merged array

		// Merge the arrays
		while (j >= 0) {
			if (i >= 0 && num1[i] > num2[j]) {
				num1[k] = num1[i];
				i--;
			} else {
				num1[k] = num2[j];
				j--;
			}
			k--;
		}
		return num1;
	}

	public static void main(String[] args) {
		int[] num1 = new int[6];
		num1[0] = 1;
		num1[1] = 5;
		num1[2] = 6;

		int[] num2 = { 2, 3, 4 };

		int n = 3;

		int m = 3;
		int[] result = mergeArray(num1, num2, m, n);
		System.out.println("Merged Array" + Arrays.toString(result));
	}

}



/* num1 = [1,2,0,0]
 * num2 = [3]
 * 
 * m = 2, n = 1 
 * 
 * i = m-1 = 1 
 * j = n-1 = 0
 * k = m+n -1 = 2+1-1 = 2
 * 
 * 
 * iteration -1 
 * 
 * j >=0 , i>=0 , num1[i] > num2[i] 
 * 					num1[1] > num2[0]? = 2 >3 No 
 * 						num1[k] = num2[j]	 , as k =2
 * 						num1[2] = 3;
 *			Now num1 = [1,2,3,0]
 * 
 * Iteration -2 
 * 
 * j>0 exit loop 
 * 
 */
 
