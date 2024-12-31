package linkedlist;

public class merge_two_sorted {

    class Node
    {
        int data ;
        Node next ;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        merge_two_sorted solution = new merge_two_sorted();
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);




    }
}
