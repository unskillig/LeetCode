
public class Solution {

	public static int sum(TreeNode root) {

		if (root == null)
			return 0;

		else {
			return root.getData() + Solution.sum(root.getLeft()) + Solution.sum(root.getRight());
		}

	}

}
