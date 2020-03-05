
public class Solution {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		reverse(101);

	}
	
	
	public static int reverse(int x){
		
		//Bsp: 123
		
		int reversed = 0;
		int temp = x;
		
		while(temp != 0){
			int pop = temp % 10;
			temp /= 10;
			
			if(reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) return 0;
			if(reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && pop < -8) return 0;
			
			
			reversed = reversed * 10 + pop;
		}
		
		
		
		
		
		return reversed;
		
	}

}
