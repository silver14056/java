package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class task1 {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(1);
//        list.add(2);
//
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1); //добавляется в очередь
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.remove(); //удаляется первый элемент из очереди
//        queue.add(5);
        Comparator<Integer> comparator = (a, b) -> b - a;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        System.out.println(priorityQueue);

        priorityQueue.add(11);
        System.out.println(priorityQueue);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        priorityQueue.add(4);
        System.out.println(priorityQueue);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        priorityQueue.add(6);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue);


        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

    }
}
