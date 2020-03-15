
public class Solution {

	public static void main(String[] args) {
		System.out.println(isPalindromeVariant1(121));
		System.out.println(isPalindromeVariant2(123));

	}
	
	 public static boolean isPalindromeVariant1(int x) {
	     String s = String.valueOf(x);
	     int j = s.length()-1;
	     
	     for(int i = 0; i < s.length()-1; i++){
	    	 if(j <= i) break;
	    	 if(s.charAt(i) != s.charAt(j)) return false;
	    	 j--;
	     }
		
		 return true;
	 }

	 
	 
 public static boolean isPalindromeVariant2(int x) {
	    
		int reversed = 0;
		
		// x wird getemped, da sich der Wert von x sonst �ndern w�rde und wir zum Schluss nicht mehr vergleichen k�nnten, ob x und das ergebnis gleich sind
		int temp = x;
		
		
		while(temp != 0){
			// letzte Ziffer holen
			int pop = temp % 10;
			// letzte Stelle von temp entfernen (:10 sorgt daf�r, dass bei einem Integer die Nachkommastelle wegf�llt)
			temp /= 10;
			// reversed um eine zehner- / hunderter .... -stelle erweitern und pop als einerstelle hinzuf�gen
			reversed = reversed * 10 + pop;
		}
		
		if(reversed != temp) return false;
		
		 return true;
	 }

}
