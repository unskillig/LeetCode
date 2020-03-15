import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatedCharacter("Hallo"));

	}
	
	public static Character firstNonRepeatedCharacter(String str) {

		HashMap<Character, Integer> existingChars = new HashMap<>();
		
		for(char c : str.toCharArray()){
				existingChars.merge(c,1,Integer::sum);
				
		}
		
		for(char c : str.toCharArray()){
			if(existingChars.get(c) == 1) return c;
		}
		return null;
		
	}

}
