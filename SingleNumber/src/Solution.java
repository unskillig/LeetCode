import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,1,1,4,5,6,7,7,6,4};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] A) {
		
		HashMap<Integer, Integer> singles = new HashMap<Integer, Integer>();
		
		
		for(int i = 0; i< A.length; i++){
			singles.merge(A[i], 1, Integer::sum);
		}
		
		for(int i : singles.keySet()){
			if(singles.get(i) == 1) return i;
		}
		return 0;
	 
	}

}
