import java.util.LinkedList;

public class testLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        while(secondPointer != null && secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;

        }
        return firstPointer;
    }
    public static void main(String[] args) {
		LinkedList<ListNode> list = new LinkedList<>();
		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(2, node);
		ListNode node2 = new ListNode(3, node1);
		ListNode node3= new ListNode(4, node2);
		ListNode node4 = new ListNode(5, node3);

//		list.add(node);
//		list.add(node1);
//		list.add(node2);
//		list.add(node3);
//		list.add(node4);
		System.out.println(middleNode(node4).val);

	}
    
}