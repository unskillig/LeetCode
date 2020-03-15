
public class Run {

	public static void main(String[] args) {
		
		Node node7 = new Node(7, "G", null);
		Node node6 = new Node(6, "F", node7);
		Node node5 = new Node(5, "E", node6);
		Node node4 = new Node(4, "D", node5);
		Node node3 = new Node(3, "C", node4);
		Node node2 = new Node(2, "B", node3);
		Node node1 = new Node(1, "A", node2);
		
		Node pointerSlow = node1;
		Node pointerFast = node1;
		
		
		while(pointerFast.getNext() != null && pointerFast.getNext().getNext() != null){
			pointerFast = pointerFast.getNext().getNext();
			pointerSlow = pointerSlow.getNext();
		}
		
		System.out.println("Mittleres Element: " + pointerSlow.getData());
		
		
		
		
		
		
		

	}

}
