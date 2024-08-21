package seminar3t;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "два", "3", "четыре", "5", "шесть"));
        for (String s : list) {
            if (isNumeric(s)) {
                System.out.println(s + " - число");
            } else {
                System.out.println(s + " - не число");
            }
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
