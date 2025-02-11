package Strings;

import java.util.ArrayList;

public class fizzBuzz {

	public static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> results = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				results.add("FIZZBUZZ");
			} else if (i % 3 == 0) {
				results.add("FIZZ");
			} else if (i % 5 == 0) {
				results.add("BUZZ");
			} else {
				results.add(Integer.toString(i));
			}
		}
		return results;
	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println(fizzBuzz(n));
	}

}
