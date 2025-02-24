package Wipro_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionArray {

	public static int[] findIntersection(int[] array1, int[] array2) {

		// Use a HashSet to store elements of the second array for quick lookup
		HashSet<Integer> set = new HashSet<>();

		for (int i : array2) {
			set.add(i);
		}

		ArrayList<Integer> intersection = new ArrayList<>();

		// Iterate through the first array and check for common elements
		for (int i : array1) {
			if (set.contains(i)) {
				intersection.add(i);
				set.remove(i);
			}
		}

		// Convert the list to an array
		int[] result = new int[intersection.size()];
		for (int i = 0; i < intersection.size(); i++) {
			result[i] = intersection.get(i);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		int[] result1 = findIntersection(arr1, arr2);
		System.out.println("Intersection: " + Arrays.toString(result1)); // Output: [3, 4]
	}
}
