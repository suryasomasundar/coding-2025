package newExercise;

import java.util.HashMap;

public class occurancesOfChar {

	public static void charOccurance(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		String str = "aabbcccccddd";
		occurancesOfChar obj = new occurancesOfChar();
		obj.charOccurance(str);
	}

}
