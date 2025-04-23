package Heap;

import java.util.PriorityQueue;

public class Smallest_num {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.add(30);
        minheap.add(20);
        minheap.add(10);
        minheap.add(2);
        minheap.add(12);
        

        while (!minheap.isEmpty())
        {
            System.out.println(minheap.poll());
        }
    }
}
