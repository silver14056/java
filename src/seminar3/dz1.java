package seminar3;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        // Если массив содержит менее двух элементов, он уже отсортирован
        if (a.length < 2) {
            return a;
        }

        // Разделяем массив на две части
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        // Рекурсивно сортируем обе половины
        left = mergeSort(left);
        right = mergeSort(right);

        // Объединяем отсортированные половины
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Сортируем и копируем элементы в результат
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Добавляем оставшиеся элементы из левого массива
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Добавляем оставшиеся элементы из правого массива
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz1{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
