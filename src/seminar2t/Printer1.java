package seminar2t;


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {

        int n = mas.length;
        log = new File("src/seminar2t/log.txt");
        if (log.exists()) {
            try {
                log.delete();
            }
            catch (Exception e) {
                System.out.println("Ошибка удаления файла");
            }

        }

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    // Меняем местами элементы
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Если ничего не переставлялось, значит массив отсортирован
            }
            logger(Arrays.toString(mas));


        }
        logger(Arrays.toString(mas));
    }

    public static void logger(String str) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());

        try {
            fileWriter = new FileWriter(log, true);
            fileWriter.write(date + " " + str);
            fileWriter.write("\n");
            fileWriter.flush();
        }
        catch (IOException ex) {
            ex.printStackTrace(); // Вывод ошибки

    }
}}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer1 {
    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("src/seminar2t/log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}