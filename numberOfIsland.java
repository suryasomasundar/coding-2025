package newExercise;

public class numberOfIsland {

	public static int numberOfIsland(char[][] grid) {

		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					count += 1;
					callBFS(grid, i, j);
				}
			}
		}
		return count;
	}

	private static void callBFS(char[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return;
		}

		grid[i][j] = '0';
		callBFS(grid, i + 1, j); // up
		callBFS(grid, i - 1, j); // down
		callBFS(grid, i, j - 1); // left
		callBFS(grid, i, j + 1); // right

	}

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '0', '1', '0', '0', '1' }, { '0', '1', '0', '0', '1' },
				{ '0', '0', '0', '0', '0' }, { '1', '0', '1', '1', '0' } };

		System.out.println(numberOfIsland(grid));
	}
}
