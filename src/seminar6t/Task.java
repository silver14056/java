package seminar6t;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        int[] arr = createArray(100, 24);
        System.out.println(Arrays.toString(arr));
        System.out.println(getPercentUniqueValues(arr));
        System.out.println(sum(arr));

    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] createArray(int l, int n) {
        Random random = new Random();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = random.nextInt(n);
        }
        return array;
    }

    public static float getPercentUniqueValues(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
        float result = set.size() * 100 / arr.length;
        return result;
    }

}
