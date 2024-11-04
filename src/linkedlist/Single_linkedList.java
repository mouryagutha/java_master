package linkedlist;

import java.util.LinkedList;

public class Single_linkedList {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(3);
       list.insertFirst(3);
       list.insertFirst(17);
       list.insertLast(33);
       list.insert(100,3);

       list.display();
       System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        list.insertFirst(23);
        list.insertFirst(34);
        list.insertFirst(17);
        list.insertLast(33);
        list.display();

        System.out.println(list.find(3));

    }
}
