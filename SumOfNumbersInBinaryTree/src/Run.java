
public class Run {

	public static void main(String[] args) {
	
		// construct binary tree
		TreeNode node1 = new TreeNode(4, null, null);
		TreeNode node2 = new TreeNode(5, null, null);
		TreeNode root = new TreeNode(1, node1, node2);
		
		System.out.println(Solution.sum(root));
	}

}
