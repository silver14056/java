package seminar_1;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH*mm:ss");
        String date = df.format(now);
        System.out.println(date);
        String time = now.format(df);
        System.out.println(time);


        System.out.println("Сегодня и сейчас: " + now);

        Date nowDate = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'и время' HH:mm:ss");
        System.out.println("Текущая дата: " + formatForDateNow.format(nowDate));



    }
}
