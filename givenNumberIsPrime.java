package arrays;

public class givenNumberIsPrime {
	
	public static boolean isPrime(int num) {
		if(num <=1) {
			return false;
		}
		for(int i=2 ; i<= Math.sqrt(num); i++) {
			if(num%i == 0) { // Reminder
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args[]) {
		int num = 5;
		System.out.println(isPrime(num));
	}

}
