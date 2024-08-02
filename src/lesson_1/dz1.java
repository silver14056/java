package lesson_1;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Введите оператор: ");
        char op = sc.nextLine().charAt(0);
        double result;
        if (op != '+' && op != '-' && op!= '*' && op!= '/') {
            System.out.println("Некорректный оператор: " + op);
        } else {
        if (op == '+') {
            result = a + b;
            System.out.println(result);
        } else if (op == '-') {
            result = a - b;
            System.out.println(result);
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Нельзя делить на 0");
            } else {
            result = (double) a / b;
            System.out.println(result);
            }
        } else {
            result = a * b;
            System.out.println(result);
        }
        }
    }
}
