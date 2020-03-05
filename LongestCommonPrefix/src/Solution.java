public class Solution {

	public static void main(String[] args) {
		String[] strings = new String[] {"aa", "a"};
		System.out.println(longestCommonPrefix(strings));

	}

	public static String longestCommonPrefix(String[] strs) {

		// Idee 1:

		boolean commonPrefix = true;
		int zaehlerString = 0;
		char prevLetter = '\0';
		char currentLetter = '\0';
		StringBuilder strBuilder = new StringBuilder();

		if(strs.length < 1) return "";
		if(strs.length == 1) return strs[0];
		
		for (int i = 0; i < strs[0].length(); i++) {
			
			for (int j = 0; j < strs.length; j++) {
				prevLetter = currentLetter;
				if(strs[j].length() <= zaehlerString){
					commonPrefix = false;
					break;
				}
				currentLetter = strs[j].charAt(zaehlerString);
				if (currentLetter != prevLetter && prevLetter != '\0') {
					commonPrefix = false;
					break;
				}
			}
			
			if(commonPrefix == false) break;
			strBuilder.append(currentLetter);
			currentLetter = '\0';
			zaehlerString++;
			
		}

		return strBuilder.toString();

	}
}
