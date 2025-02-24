package Wipro_Practise;

import java.util.Arrays;
import java.util.PriorityQueue;

public class secondLargestElementArray {

	public static int secondLargestElementClassic(int[] n) {
		if (n.length <= 1) {
			throw new IllegalArgumentException("Array length should be greater than 1");
		}

		Arrays.sort(n);

		if (n[0] == n[n.length - 1]) {
			throw new IllegalArgumentException("Array has all same inregers no second largest number");
		}

		return n[n.length - 2];
	}

	public static int SecondLargestElementPriority(int[] nums) {

		if (nums.length <= 1) {
			throw new IllegalArgumentException("Array length should be greater than 1");
		}
		
		boolean allSame = true;
		int first = nums[0];
		for(int i : nums) {
			if(i != first) {
				allSame = false;
				break;
			}
		}
		
		if(allSame == true) {
			throw new IllegalArgumentException("Array has all same inregers no second largest number");
		}
		
		PriorityQueue<Integer> minheap = new PriorityQueue<>();

		for (int i : nums) {
			minheap.add(i);
			if (minheap.size() > 2) {
				minheap.remove();
			}
		}
		return minheap.remove();

	}

	public static void main(String[] args) {
		int[] n = { 1, 3, 2, 5, 9, 6 };
		int[] num = { 1, 1, 1, 1, 1, 1, 1 };
		int[] array1 = {5, 2, 8, 12, 3};
		System.out.println(secondLargestElementClassic(n));
		System.out.println(SecondLargestElementPriority(num));
		System.out.println(SecondLargestElementPriority(array1));
	}

}
