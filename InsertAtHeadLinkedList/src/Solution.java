
public class Solution {

	public static void main(String[] args) {
		
		ListNode sixth = new ListNode(24, null);
		ListNode fifth = new ListNode(22, sixth);
		ListNode fourth = new ListNode(9, fifth);
		ListNode third = new ListNode(6, fourth);
		ListNode second = new ListNode(4, third);
		ListNode first = new ListNode(1, second);
		
		printList(first);
		first = insertAtHead(first, 5);
		printList(first);
		

	}
	
	public static ListNode insertAtHead(ListNode head, int data) {
		
		ListNode newNode = new ListNode(data, head);
		head = newNode;
		
		
		return head;

        
	}
	
	
	public static void printList(ListNode head){
		ListNode iterator = head;
		
		while(iterator != null){
			System.out.println(iterator.getValue());
			iterator = iterator.getNext();
		}
	}

}
