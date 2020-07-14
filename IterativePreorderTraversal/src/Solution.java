import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	public static ArrayList<Integer> preorderItr(TreeNode root) {

		// Iterative Preorder Traversal
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		if (root == null)
			return result;
		stack.push(root);
		result.add(root.getData());

		while (!stack.isEmpty()) {
			// traverse to lefthand side
			if (root.getLeft() != null && !result.contains(root.getLeft().getData())) {
				root = root.getLeft();
				stack.push(root);
				result.add(root.getData());
				// traverse to righthand side
			} else if (root.getRight() != null && !result.contains(root.getRight().getData())) {
				root = root.getRight();
				stack.push(root);
				result.add(root.getData());
			}
			// when we have found a leaf
			else {
				stack.pop();
				if (!stack.isEmpty()) {
					root = stack.peek();
				}
			}

		}

		return result;

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

		System.out.println(Solution.preorderItr(root));

	}
}
