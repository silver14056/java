package seminar3t;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }
        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.sort(null);
        System.out.println(1);
        System.out.println(list1.toString());

        ArrayList<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2);
        System.out.println(2);
        System.out.println(list2.toString());

        ArrayList<Integer> list3 = new ArrayList<>(list);
        Collections.sort(list3, Collections.reverseOrder());
        System.out.println(3);
        System.out.println(list3.toString());
    }
}
