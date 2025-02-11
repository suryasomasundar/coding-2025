package arrays;

public class containerWithMostWater {

	public static int maxAreaTwoPointers(int[] heights) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < heights.length; i++) {
			for (int j = i + 1; j < heights.length; j++) {
				int min = Math.min(heights[i], heights[j]);
				max = Math.max(max, min * (j - i));
			}
		}
		return max;
	}
	
	
	public static int maxAreaBinary(int[] heights) {
		int max = Integer.MIN_VALUE;
		int i = 0; int j = heights.length-1;
		while(i<j) {
			if(heights[i] < heights[j]) {
				max = Math.max(max, heights[i] * (j-i));
				i++;
			}else {
				max = Math.max(max, heights[j] * (j-i));
				j--;
			}
		}
		return max;
	}

			
	
	public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxAreaBinary(heights));
		
	}

}
