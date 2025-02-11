package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthLargestElementArray {
	
	public static int kthLargestSort(int[] nums , int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
		
	}
	
	public static int kthLargestUsingQueue(int[] nums , int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		
		for(int i : nums) {
			minheap.add(i);
			if(minheap.size() > k) {
				minheap.remove();
			}
		}
		return minheap.remove();
	}
	
	public static void main(String[] args) {
		int[] nums = {1,5,7,3};
		int k = 2;
//		System.out.println(kthLargestSort(nums, k));
		System.out.println(kthLargestUsingQueue(nums, k));
	}

}
