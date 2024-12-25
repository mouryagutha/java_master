package linkedlist;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

public class Reverse_LL {
    Node head;
    public void append(int data)
    {
        Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
                return;
            }
            Node current = head;
            while(current.next != null)
            {
                current = current.next;

            }
            current.next = newnode;
    }

    public void reverse()
    {
        Node pre = null;
        Node current = head;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        head = pre;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        Reverse_LL list = new Reverse_LL();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Original Linked List:");
        list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> null

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList(); // Output: 4 -> 3 -> 2 -> 1 -> null
    }
}

