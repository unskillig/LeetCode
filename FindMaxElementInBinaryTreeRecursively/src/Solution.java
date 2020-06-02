
public class Solution {

	public static int findMax(TreeNode root) {
		int max = 0, rMax = 0, lMax = 0, rTD = 0;
		
		if (root != null) {
			rTD = root.data;
			rMax = findMax(root.right);
			lMax = findMax(root.left);
			
			if( lMax > rMax) {
				max = lMax;
			}
			else {
				max = rMax;
			}
			
			if(rTD > max) {
				max = rTD;
			}
			
		}
		  return max;
	    
	}
	
	
	public static void main(String[] args) {
		TreeNode five = new TreeNode(5, null, null);
		TreeNode four = new TreeNode(4, null, null);
		TreeNode three = new TreeNode(3, four, five);
		TreeNode two = new TreeNode(2, null, null);
		TreeNode root = new TreeNode(1, two, three);
		
		System.out.println(findMax(root));

	}

}
