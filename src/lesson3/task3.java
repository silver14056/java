package lesson3;

import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day,month,year};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);
        //---------------------------------------------------------------------

        StringBuilder day1 = new StringBuilder("28");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        StringBuilder[] date1 = new StringBuilder[]{day1,month1,year1};
        List<StringBuilder> d1 = Arrays.asList(date1);
        date1[1] = new StringBuilder("09");
        System.out.println(d1);

    }
}
