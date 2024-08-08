package seminar_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LocalDateTime now = LocalDateTime.now();
        DateFormat df =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(now));
        System.out.println(df.format(now));
        System.out.println("Сегодня и сейчас: " + now);



    }
}
