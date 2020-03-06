
public class Node {

	private int id;
	private String data;
	private Node next;
	
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(int id, String data, Node next) {
		super();
		this.id = id;
		this.data = data;
		this.next = next;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
	
	
}
