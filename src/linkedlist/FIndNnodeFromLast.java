package linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FIndNnodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        // Move the second pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (secondPtr.next != null) {
                secondPtr = secondPtr.next;
            } else {
                // If n is larger than the list length
                return head;
            }
        }

        // Move both pointers until the next of secondPtr is null
        while (secondPtr.next != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        // Remove the node next to firstPtr
        firstPtr.next = firstPtr.next.next;

        // Return the updated head
        return dummy.next;
    }

    // Helper to print the list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper to create a linked list
    public ListNode createList(int[] values) {
        ListNode head = null, tail = null;
        for (int val : values) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        FIndNnodeFromLast list = new FIndNnodeFromLast();
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = list.createList(values);

        System.out.println("Original List:");
        list.printList(head);

        // Remove the 2nd node from the end
        head = list.removeNthFromEnd(head, 2);

        System.out.println("List after removing 2nd node from the end:");
        list.printList(head);
    }
}
