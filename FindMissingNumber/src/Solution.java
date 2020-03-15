import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] numbers = {1,6,2,4,3,7,9,8,10};
		System.out.println(findMissingNumber(numbers));
	}
	
	public static int findMissingNumber(int[] arr) {

		
		return 55 - Arrays.stream(arr).sum();
		
		
		
		/*
		int missing = 1;
		
		Arrays.sort(arr);
		
	    for(int i = 0; i < arr.length; i++) {
	    	if(arr[i] != missing) return missing;
	    	missing++;
	    }
	    
	    return 0;
	    
	    */
	    
	}

}
