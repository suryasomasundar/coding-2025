 package math;

public class passPillow {

	public static int passPillow(int n, int time) {

		// If there's only 1 person, they always have the pillow
		if (n == 1) {
			return 1;
		}

		int cycleLength = 2 * (n - 1); // One full cycle (forward + backward)
		int effectiveTime = time % cycleLength; // Reduce time within a single cycle

		// If effective time is in forward phase
		if (effectiveTime < n) {
			return effectiveTime + 1; // Forward movement
		} else {
			return 2 * n - effectiveTime - 1; // Backward movement
		}
	}

	public static void main(String[] args) {
		System.out.println(passPillow(4, 8)); // Expected: 3 ✅

		System.out.println(passPillow(5, 8)); // Expected: 1 ✅
		System.out.println(passPillow(1, 100)); // Expected: 1 ✅

		System.out.println(passPillow(5, 13)); // Expected: 4 ✅

	}

}
