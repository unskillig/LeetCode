
public class Solution {

	public static void main(String[] args) {
		
		ListNode first = new ListNode(1, null);
		
		try{
			System.out.println(deleteAtHead(first).getValue());
		} catch(Exception e){
			throw new NullPointerException("Kein Wert vorhanden.");
		}
		

	}
	
	
	public static ListNode deleteAtHead(ListNode head){
		
		if(head == null || head.getNext() == null) return null;
		
		ListNode temp = head;
		head = null;
		head = temp;
		
		return temp;
		
		// kurz: aber head not detached --> memory leak
		//return (head != null) ? head.getNext() : null;
		
	}

}
