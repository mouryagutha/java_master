package linkedlist;

public class Rotate_LL {

    static class Node
    {
        int data ;
        Node next ;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data)
    {
        Node newnode = new Node(data);

        if(head == null)
        {
            head = newnode;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    public void rotate(int k)
    {
        if(head == null || k == 0)
        {
            return;
        }
        Node temp = head;
        int length = 1 ;
        while (temp.next != null)
        {
            temp = temp.next;
            length++;
        }

        k= k% length;
        if(k==0)
        {
            return;
        }

        temp.next = head;

        int steptoforward = length - k;
        Node newtail =  head;
        for(int i =1 ; i< steptoforward ; i++)
        {
            newtail = newtail.next;
        }

        Node newHead = newtail.next;

        newtail.next = null;

        head = newHead;


    }

    public void printlist()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


     public static void main(String[] args) {

         Rotate_LL list = new Rotate_LL();

         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);

         list.printlist();

         int k = 4;
         list.rotate(k);

         list.printlist();



    }
}
