
public class Solution {

	public static void main(String[] args) {

		int[] nums = { 3,3 };
		int val = 3;
		System.out.println(removeElement(nums, val));

	}

	public static int removeElement(int[] nums, int val) {

		 int i = 0;
		    for (int j = 0; j < nums.length; j++) {
		        if (nums[j] != val) {
		            nums[i] = nums[j];
		            i++;
		        }
		    }
		    return i;
	}

}
