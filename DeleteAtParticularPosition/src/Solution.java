
public class Solution {

	public static ListNode deleteAtParticularPosition(ListNode head, int position) {

		ListNode prev = head;
		int counter = 1;

		if (position == 1) {
			return head == null ? null : head.next;
		}

		ListNode curr = head.next;
		counter++;

		while (curr != null) {
			if (counter == position) {
				prev.next = curr.next;
				return head;
			}

			else {
				counter++;
				prev = prev.next;
				curr = curr.next;
			}
		}

		return head;

	}

	public static void main(String[] args) {

		ListNode node4 = new ListNode(4, null);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode root = new ListNode(1, node2);

		ListNode traverse = deleteAtParticularPosition(root, 4);

		while (traverse != null) {
			System.out.println(traverse.data);
			traverse = traverse.next;
		}

	}

}
