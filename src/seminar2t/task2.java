package seminar2t;

import java.util.Scanner;
import java.util.logging.Logger;

public class task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("task2");
        String input;
        String output = "";

        logger.info("Введите строку");
        input = sc.nextLine();

        if (input.length() == 0) {
            throw new Exception("Пустая строка");
        }


//        for (int i = 0; i < input.length(); i++) {
//            if (!output.contains(Character.toString(input.charAt(i)))) {
//                output += input.charAt(i);
//            }
//        }
        char c;
        StringBuilder sb = new StringBuilder();
        c = input.charAt(0);
        sb.append(c);
        for(char item: input.toCharArray()){
            if(c != item) {
                sb.append(item);
            }
            c = item;
        }
        logger.info(sb.toString());
    }
}
