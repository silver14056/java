package seminar4t;

import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        String str = "{[()]}";
        Task3 t = new Task3();
        System.out.println(t.validate(str));
    }

    public boolean validate(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (stack.isEmpty()){
                return false;
            } else if (c == ')' && stack.pop()!= '('){
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            }

        }
        return stack.isEmpty();
   }


}
