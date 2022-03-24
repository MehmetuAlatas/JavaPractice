package day30collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class QueueDeque01 {
    public static void main(String[] args) {

        //Queue===>FIFO
        Queue<String> q1=new LinkedList<>();
        q1.offer("lutfu");
        q1.offer("mustafa");
        q1.offer("ridvan");
        System.out.println(q1);

        q1.remove();
        System.out.println(q1);

        q1.remove();
        System.out.println(q1);

        //This will be learnt more while lamda instructions
        Queue<String> q2=new PriorityQueue<>();

        //Dequeue ==> double ended Queue ==> FIF0 + LIFO
        Deque<String>d1=new LinkedList<>();
        d1.addFirst("a");
        d1.addFirst("b");
        d1.addFirst("c");

        System.out.println(d1);

        d1.remove();
        System.out.println(d1);


        d1.remove();
        System.out.println(d1);









    }
}
