
public class Solution {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));

	}
	
	 public static int romanToInt(String s) {
		 // "I" = 1
		 // "V" = 5
		 // "X" = 10
		 // "L" = 50
		 // "C" = 100
		 // "D" = 500
		 // "M" = 1000
		 
	    int result = 0;
	    int temp = 0;
	    switch(s.charAt(0)){
 	 		case 'I': result = 1; break;
 	 		case 'V': result = 5; break;
 	 		case 'X': result = 10; break;
 	 		case 'L': result = 50; break;
 	 		case 'C': result = 100; break;
 	 		case 'D': result = 500; break;
 	 		case 'M': result = 1000; break;
 	 }
	    temp = result;
	     
	     for(int i = 1; i < s.length(); i++){
	    	 int zahl = 0;
	    	 switch(s.charAt(i)){
	    	 	case 'I': zahl = 1; break;
	    	 	case 'V': zahl = 5; break;
	    	 	case 'X': zahl = 10; break;
	    	 	case 'L': zahl = 50; break;
	    	 	case 'C': zahl = 100; break;
	    	 	case 'D': zahl = 500; break;
	    	 	case 'M': zahl = 1000; break;
	    	 }
	    	 
	    	 if(temp == 1 && (zahl == 5 || zahl == 10)){
	    		 result = result - temp*2 + zahl;
	    		 temp = zahl;
	    	 }
	    	 
	    	 else if(temp == 10 && (zahl == 50 || zahl == 100)){
	    		 result = result - temp*2 + zahl;
	    		 temp = zahl;
	    	 }
	    	 
	    	 else if(temp == 100 && (zahl == 500 || zahl == 1000)){
	    		 result = result - temp*2 + zahl;
	    		 temp = zahl;
	    	 }
	    	 
	    	 else{
	    		 temp = zahl;
	    		 result = result + zahl;
	    	 }
	     }
	     
		 return result;
	    }

}
