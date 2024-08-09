package seminar2t;

import java.util.Arrays;

//class Answer {
//    public static StringBuilder answer(String QUERY, String PARAMS){
//        // Напишите свое решение ниже
//        StringBuilder answer = new StringBuilder();
//        answer.append(QUERY);
//        String tempStr = PARAMS.substring(1, PARAMS.length()-1);
//        String[] params = tempStr.split(", ");
//        for (String param : params) {
//            String[] parts = param.split(":");
////            for (String part : parts) {
////                System.out.println(part);
////            }
////            System.out.println();
////            System.out.println(parts[0].substring(1, parts[0].length()-1));
////            System.out.println(parts[1].substring(1, parts[1].length()-1));
////            System.out.println("-------");
//            if (!parts[1].substring(1, parts[1].length()-1).equals("null")) {
//                answer.append(parts[0].substring(1, parts[0].length()-1)).append("=\'");
//                answer.append(parts[1].substring(1, parts[1].length()-1)).append("\' and ");
//            }
//        }
////        System.out.println(answer.toString());
//        answer.deleteCharAt(answer.length()-1);
//        answer.deleteCharAt(answer.length()-1);
//        answer.deleteCharAt(answer.length()-1);
//        answer.deleteCharAt(answer.length()-1);
//        answer.deleteCharAt(answer.length()-1);
////        System.out.println(answer.toString());
//        return answer;
//    }
//}
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        for (int i = 0; i < params.length; i++){
            String[] elements = params[i].replace('"', ' ').split(":");
            if(!"null".equals(elements[1].trim())){
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2) stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}