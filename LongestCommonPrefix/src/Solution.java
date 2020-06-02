public class Solution {

	public static void main(String[] args) {
		String[] strings = new String[] {"flow", "flight", "flood"};
		System.out.println(longestCommonPrefix(strings));
		System.out.println(longestCommonPrefix2(strings));

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
	
	public static String longestCommonPrefix2(String[] strs) {
	  if (strs.length == 0) return "";
      String prefix = strs[0];
      for (int i = 1; i < strs.length; i++)
          while (strs[i].indexOf(prefix) != 0) {
              prefix = prefix.substring(0, prefix.length() - 1);
              if (prefix.isEmpty()) return "";
          }        
      return prefix;
	}
}
