package math;

public class powerofThree {

	public static boolean powerofThree(int n) {

		if (n <= 0)
			throw new IllegalArgumentException("n has to be a postivie Integer");
		
		if (n == 1)
			return true;

		while (n > 1) {
			if (n % 3 != 0) { // Reminder - If n is not divisible by 3, it's not a power of three
				return false;
			} else {
				n = n / 3; //Quotient 
	
			}
		}
		return true; // If n reduces to 1, it's a power of three

	}
	
	public static void main (String[] args) {
		int n = 10;
		System.out.println(powerofThree(n));
	}

}
