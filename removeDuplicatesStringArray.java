package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicatesStringArray {
	
	public static void main(String[] args) {
		String [] colors = {
				"red",
				"yellow",
				"green",
				"green"
		};
		
		System.out.println("Original StringArray" + Arrays.toString(colors));
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(colors));
		
		String[] results = set.toArray(new String[set.size()]);
		
		System.out.println(Arrays.asList(results));
	}

}
