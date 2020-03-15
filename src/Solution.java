public class Solution {

	public static void main(String[] args) {
		int[] numbers = {2,5,7,8,9,12};
		System.out.println(binarySearch(numbers, 8));
		
	}
	
	public static Boolean binarySearch(int[] arr, int n){
		
		int low = 0, high = arr.length-1;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			if(arr[middle] == n) return true;
			
			if(arr[middle] < n) {
				low = middle+1;
			}
			
			else {
				high = middle-1;
			}
		}
		
		return false;
		  



	}

}
