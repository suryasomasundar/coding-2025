package newExercise;

public class trappingRainWater {

	public static int trapRainWater(int[] heights) {
		
		// Logic Here - https://leetcode.com/problems/trapping-rain-water/solutions/6420479/trapping-rain-water-beats-99-1-3-approaches

		int n = heights.length;

		int[] leftMax = new int[n];
		leftMax[0] = heights[0];

		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
		}

		int[] rightMax = new int[n];
		rightMax[n - 1] = heights[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(leftMax[i + 1], heights[i]);
		}

		int max = 0;

		for (int i = 0; i < n; i++) {
			max += Math.min(leftMax[i], rightMax[i]) - heights[i];
		}

		return max;
	}
	
	
	public static void main(String[] args) {
		int[] heights = {4,2,0,3,2,5};
		System.out.println(trapRainWater(heights));
	}

}
