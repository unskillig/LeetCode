import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		System.out.println(areAllCharactersUnique("Halo"));

	}
	
	public static boolean areAllCharactersUnique(String str){
		
		Set<Character> chars = new HashSet<Character>();
		
		if(str == null || str.length() == 0) return true;
		
		for(char c : str.toCharArray()) {
			if(chars.contains(c)) return false;
			chars.add(c);
		}
		
		return true;
	   
	}

}
