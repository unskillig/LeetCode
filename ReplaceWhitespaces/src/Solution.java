
public class Solution {

	public static void main(String[] args) {
		System.out.println(replace("Hallo Shari, wie geht es dir?", ")"));

	}
	
	public static String replace(String a, String b) {	
		
		if(a == null) return null;
		if(b == null) return a;
		
		StringBuilder result = new StringBuilder();
		for(char c : a.toCharArray()){
			if(c != 32) result.append(c);
			else{
				result.append(b);
			}
		}
		
		return result.toString();

	}

}
