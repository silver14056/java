package seminar4;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        double result;
        switch (op) {
            case '+':
                result = a + b;
                resultsStack.push(result);
                return result;
            case '-':
                result = a - b;
                resultsStack.push(result);
                return result;
            case '*':
                result = a * b;
                resultsStack.push(result);
                return result;
            case '/':
                if (b != 0) {
                    result = a / b;
                    resultsStack.push(result);
                    return result;
                }
            case '<':
                resultsStack.pop();
                prevResult = resultsStack.peek();
                return prevResult;
            default:
                return 0;
        }

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}