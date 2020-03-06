
public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,3};
		int target = 3;
		System.out.println(searchInsert(nums, target));

	}
	
	 public static int searchInsert(int[] nums, int target) {
	        int i = 0;
	        
	        if(nums.length == 0) return 0;
	        
	        for(int j = i+1; j < nums.length; j++){
	            if(nums[i] == target) return i;
	            if(nums[j] == target) return j;
	    
	            if(nums[i] >= target) return i;
	           
	            if(nums[i] < target && nums[j] > target) return j;

	            i++;
	            
	            
	           
	        }
	        
	        
	        if(nums.length == 1) {
	        	if(nums[0] < target) return i+1;
	        	return i;
	        }
	        return i+1;
	    }

}
