package deleteAtTail;

public class Solution {

	public static void main(String[] args) {

		ListNode fifth = new ListNode(9, null);
		ListNode fourth = new ListNode(8, fifth);
		ListNode third = new ListNode(6, fourth);
		ListNode second = new ListNode(4, third);
		ListNode first = new ListNode(1, second);

		System.out.println("originial List:");
		print(first);
		deleteAtTail(first);
		System.out.println("Tail deleted:");
		print(first);
	}

	public static ListNode deleteAtTail(ListNode head) {
		ListNode iterator = head;

		while (iterator.getNext().getNext() != null) {
			iterator = iterator.getNext();
		}
		iterator.setNext(null);
		return head;

	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.println(head.getValue());
			head = head.getNext();
		}
	}
}
