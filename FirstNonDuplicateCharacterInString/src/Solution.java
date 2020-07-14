import java.util.HashMap;

public class Solution {

	public static Character firstNonRepeatedCharacter(String str) {

		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			hash.put(c, hash.getOrDefault(c, 0) + 1);
		}

		for (char c : str.toCharArray()) {
			if (hash.get(c) == 1) {
				return c;
			}
		}
		return null;

	}

	public static void main(String[] args) {
		String str = "alligator";
		System.out.println(firstNonRepeatedCharacter(str));
	}

}
