package linkedlist;

public class Middle_num {
    class  Node
    {
        int data;
        Node next;

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
        newnode.next = head;
        head = newnode;
    }

    public Node middlenum()
    {
        if(head == null)
        {
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void printlist()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    


    public static void main(String[] args) {

        Middle_num list = new Middle_num();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.printlist();

        Node middle = list.middlenum();

        System.out.println("the middle number is "+(middle != null? middle.data : "list is empty"));

    }
}
