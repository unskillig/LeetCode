
public class Solution {

	public static void main(String[] args) {

		System.out.println(reverseString("Hallo"));

	}

	public static String reverseString(String str) {
		
		if(str == null) return null;
		
		char[] inputString = str.toCharArray();
		StringBuilder result = new StringBuilder();
		
		
		for(int i = inputString.length-1; i >= 0; i--){
			result.append(inputString[i]);
		}

		return result.toString();
	}

}
