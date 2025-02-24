package newExercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class printAllDuplicateCharInString {

	public static void printDuplicate(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Character --> " + entry.getKey() + " & Count -->" + entry.getValue());
			}

		}

	}

	public static void main(String[] args) {
		String str = "aabbcccccdddefgh";
		printAllDuplicateCharInString obj = new printAllDuplicateCharInString();
		obj.printDuplicate(str);
	}

}
