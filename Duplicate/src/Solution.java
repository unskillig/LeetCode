import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,2,1,2,4};
		System.out.println(duplicate(numbers));
	}
	
	
	public static String duplicate(int[] numbers){
		
		HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
		StringBuilder dupChars = new StringBuilder();
		
		if(numbers == null || numbers.length == 0) return null;
		
		for(int i = 0; i < numbers.length; i++){
			if(duplicates.containsKey(numbers[i])){
				dupChars.append(numbers[i]);
			}
			else{
				duplicates.put(numbers[i], 1);
			}
		}
		
		char[] tempArray = dupChars.toString().toCharArray();
		Arrays.sort(tempArray);
		
		return new String(tempArray);
	}

}
