package newExercise;

import java.util.Arrays;

public class uniqueIntegerSumToZero {

	public static int[] uniqueSum(int n) {

		int[] result = new int[n]; // Create an array of size n
		int left = 0; // Pointer for the left side of the array
		int right = n - 1; // Pointer for the right side of the array
		int num = 1; // starting number for paring

		// Fill the array with pairs of positive and negative numbers
		while (left < right) { 
			result[left] = num;  // Place positive number on the left
			result[right] = -num; // Place negative number on the right
			left++; // Move left
			right--; // Move Right
			num++; //Increment the number for the next pair
		}

		// If n is odd, set the middle element to 0
		if (n % 2 != 0) {
			result[left] = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(uniqueSum(n)));

	}

}
