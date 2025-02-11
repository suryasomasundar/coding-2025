package arrays;

public class printNPrimeNumbers {
	
	public static boolean isPrime(int num) {
		if(num <=1) {
			return false;
		}
		
		for(int i=2; i<= Math.sqrt(num); i++) {
			if(num%i ==0) {
				return false;
			}
		
		}
		return true; 
	}
	
	public static int[] nPrimes(int n) {
		if(n <=0) {
			return new int[0];
		}
		int num =2;
		int count = 0;
		int[] primes = new int[n];
		
		while(count < n) {
			if(isPrime(num)) {
				primes[count] = num;
				count ++;
			}
			num++;
		}
		
	 return primes;
	}

	public static void main(String args[]) {
		int n = 5;
		int[] primes = nPrimes(n);
		for (int result : primes)
		System.out.println(result);
		
	}
}
