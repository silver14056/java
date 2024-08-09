package seminar2t;

import java.util.*;
import java.util.logging.Logger;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("task4");

        logger.info("Введите строку");
        String s = sc.nextLine(); //ввод строки
//        List<Integer> index = new ArrayList<>(s.length());
//        for (int i = 1; i <= s.length(); i++) {
//            index.add(i);
//        }
//        Collections.shuffle(index);
//        StringBuilder sbInt = new StringBuilder();
//        for (int i = 0; i < index.size(); i++) {
//            sbInt.append(index.get(i)).append(" ");
//        }
//        logger.info(sbInt.toString());
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < index.size(); i++) {
//            sb.append(s.charAt(index.get(i) - 1));
//        }
//        logger.info(sb.toString());
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            logger.info("Введите значение индекса массива");
            arr[i] = sc.nextInt();
        }
        char[] result = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            char temp = s.charAt(i);
            int tempIndex = arr[i];
            result[tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result));
    }
}
