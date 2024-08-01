package Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_Impl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Collections.reverseOrder();
        int[] arr = {12,34,24,32,36};
        for(int i:arr)
            pq.add(i);

        System.out.println(pq);

        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
    }
}
