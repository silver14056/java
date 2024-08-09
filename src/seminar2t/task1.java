package seminar2t;

import java.util.Scanner;
import java.util.logging.Logger;

public class task1 {
    public static void main(String[] args) throws Exception{
        /*
        int a = 2;
        String s = "";
        char c1 = '+';
        char c2 = '-';
        for (int i = 0; i < a; i++) {
            s = s + c1 + c2;
        }
        System.out.println(s);

         */
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("task1");
        String c1;
        String c2;
        int n;

        logger.info("Введите значение c1: ");
        c1 = sc.next();
        logger.info("Введите значение c2: ");
        c2 = sc.next();
        logger.info("Введите значение n: ");
        n = sc.nextInt();

        if (n <= 0) {
            throw new Exception("Не валидное значение n");
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(c1);
            }
            if (i % 2 == 1) {
                System.out.print(c2);
            }
        }
    }
}
