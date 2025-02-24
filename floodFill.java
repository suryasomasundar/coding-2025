package newExercise;

public class floodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		if (image[sr][sc] == newColor)
			return image;
		fill(image, sr, sc, image[sr][sc], newColor);
		return image;

	}

	private static void fill(int[][] image, int sr, int sc, int color, int newColor) {

		if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color)
			return;

		image[sr][sc] = newColor;
		fill(image, sr - 1, sc, color, newColor); // before Row (Top)
		fill(image, sr + 1, sc, color, newColor); // After Row (Bottom)
		fill(image, sr, sc - 1, color, newColor); // Before col (Left)
		fill(image, sr, sc + 1, color, newColor); // After col (Right)

	}

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int[][] out = floodFill(image, 1, 1, 2);

		for (int[] row : out) {
			for (int element : row) {
				System.out.println(element + " ");
			}
			System.out.println();
		}
	}
}
