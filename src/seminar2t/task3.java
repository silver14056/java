package seminar2t;

import java.util.Scanner;
import java.util.logging.Logger;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("task3");
        String jewels, stones;

        logger.info("Введите драгоценную строку: ");
        jewels = sc.nextLine();
        if (jewels.isEmpty()) {
            throw new Exception("Пустая строка");
        }

        logger.info("Введите строку \"кучу\": ");
        stones = sc.nextLine();
        if (stones.isEmpty()) {
            throw new Exception("Пустая строка");
        }

        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < jewels.length(); i++) {
//            if (stones.contains(String.valueOf(jewels.charAt(i)))) {
//                if (!sb.toString().contains(String.valueOf(jewels.charAt(i)))) {
//                    sb.append(jewels.charAt(i));
//                    int count = stones.length() - stones.replace(String.valueOf(jewels.charAt(i)), "").length();
//                    sb.append(count);
//                }
//            }
//
//        }
        int count = 0;
        for (char c1 : jewels.toCharArray()) {
            for (char c2 : stones.toCharArray()) {
                if (c1 == c2) {
                    count++;
                }
            }
            if (count > 0) {
                sb.append(c1);
                sb.append(":");
                sb.append(count);
                sb.append(" ");
            }
            count = 0;
        }
        logger.info(sb.toString());
    }
}
