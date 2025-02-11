package arrays;

public class givenNumerisFibonacci {
	
	public static boolean isPerfctSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}
	
	public static boolean isFibonacci(int num) {
		return isPerfctSquare(5 * num * num +4) || isPerfctSquare(5 * num * num -4);
	}
	
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 2;
		int num3 = 14;
		
		System.out.println(isFibonacci(num1));
		System.out.println(isFibonacci(num2));
		System.out.println(isFibonacci(num3));
	}

}
