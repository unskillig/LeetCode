
public class Solution {

	public static void main(String[] args) {
		System.out.println(breakPalindrome("aba"));

	}
	
	 public static String breakPalindrome(String palindrome) {
		 StringBuilder result = new StringBuilder(palindrome);
		 if(result.length() == 1) return "";
		 
		 for(int i = 0; i < result.length(); i++) {
			 
			 if(result.length() % 2 != 0 && i == result.length()/2) {
				 continue;
			 }
			 
			 if(result.charAt(i) != 'a') {
				result.setCharAt(i, 'a');
				return result.toString();
			 }
			 
			
			
			 
			 if(i == result.length()-1) {
				 result.setCharAt(i, 'b');
				 return result.toString();
			 }
		 }
		 
		 
		 return palindrome;
		 
	 }
	 

}
