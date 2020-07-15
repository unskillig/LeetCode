
public class Solution {

	public static int findMax(TreeNode root) {
		int max = Integer.MIN_VALUE, rtd = Integer.MIN_VALUE, ld = Integer.MIN_VALUE, rd = Integer.MIN_VALUE;
		if (root != null) {
			rtd = root.data;
			ld = findMax(root.left);
			rd = findMax(root.right);
			if (ld > rd) {
				max = ld;
			} else {
				max = rd;
			}
			if (rtd > max) {
				max = rtd;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		TreeNode node9 = new TreeNode(9, null, null);
		TreeNode node8 = new TreeNode(8, null, null);
		TreeNode node7 = new TreeNode(7, null, null);
		TreeNode node6 = new TreeNode(6, null, null);
		TreeNode node5 = new TreeNode(5, null, null);
		TreeNode node4 = new TreeNode(4, node8, node9);
		TreeNode node3 = new TreeNode(3, node6, node7);
		TreeNode node2 = new TreeNode(2, node4, node5);
		TreeNode root = new TreeNode(1, node2, node3);

		System.out.println(findMax(root));

	}

}
