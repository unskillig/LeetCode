
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
		
		return (head != null) ? head.getNext() : null;
		
	}

}
