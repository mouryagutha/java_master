package linkedlist;

public class Palidrome_LL {

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isplidrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        Node fast = head ;
        Node slow = head;
        while(fast != null && fast.next != null)
        {
          slow = slow.next;
          fast = fast.next.next;

        }

        Node secondhalf = reverselist(slow);

        Node firsthalf = head , secondhalfcopy = secondhalf;

        while(secondhalf != null)
        {
            if(firsthalf.data != secondhalf.data)
            {
                reverselist(secondhalf);
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }

        reverselist(secondhalfcopy);

        return true;


    }

    private Node reverselist(Node head)
    {
    Node curr = head , prev = null , next;
    while(curr != null)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
    }
    public static void main(String[] args) {
        Palidrome_LL pll = new Palidrome_LL();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " + pll.isplidrome(head));
    }
}
