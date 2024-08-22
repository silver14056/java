package seminar3;

import java.util.Arrays;
import java.util.ArrayList;

class Answer1 {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer1 ans = new Answer1();
        ans.removeEvenNumbers(arr);
    }
}