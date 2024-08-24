package seminar4t;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    public static void main(String[] args) {
//        ArrayDeque<Integer> deque = new ArrayDeque<>();
//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        deque.add(3);
//        deque.add(2);
//        deque.add(1);
//        System.out.println(deque);
//
//        while (!deque.isEmpty()) {
//            if (deque.size() > 1) {
//                if (deque.pollFirst() == deque.pollLast()) {
//                    System.out.println("Пока Yes");
//                } else {
//                    System.out.println("No");
//                    System.exit(0);
//                }
//            } else {
//                deque.pollFirst();
//            }
//        }
//        System.out.println("Yes");
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,3,1));
        Task1 task1 = new Task1();
        System.out.println(task1.checkOn(deque));
    }

    public boolean checkOn(Deque<Integer> deque){
        if(deque == null) {
            throw new IllegalStateException();
        }
        if(deque.size() <= 1){
            return true;
        }
        while(deque.size() >= 2) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

}
