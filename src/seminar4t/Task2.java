package seminar4t;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        System.out.println(solution(deque1, deque2));
        Deque<Integer> deque3 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> deque4 = new ArrayDeque<>(Arrays.asList(5,4,7));
        Task2 t = new Task2();
        System.out.println(t.sum(deque3, deque4).toString());
    }
    public static int solution(Deque<Integer> deque1, Deque<Integer> deque2) {
        int result = 0;
        int coeff = 1;
        while (!deque1.isEmpty() &&!deque2.isEmpty()) {
            result += (deque1.pollFirst() + deque2.pollFirst()) * coeff;
            coeff *= 10;
        }
        return result;
    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        if (d1 == null || d2 == null) {
            throw  new IllegalStateException();
        }
        Deque<Integer> result = new ArrayDeque<>();
        int digit = 0;
        while (d1.size() > 0 || d2.size() > 0) {
            int sum = 0 + digit;
            digit = 0;
            if (d1.size() > 0) {
                sum += d1.poll();
            }
            if (d2.size() > 0) {
                sum += d2.poll();
            }
            if (sum > 9) {
                digit = 1;
                sum -= 10;
            }
            result.offer(sum);
        }
        if (digit != 0) {
            result.offer(digit);
        }
        return result;
    }
}
