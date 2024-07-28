package lesson_1;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициент");
        int k = Integer.parseInt(sc.nextLine());
        String s = "";

        int[] lst = new int[k + 1];
        Random rnd = new Random();
        for (int i = 0; i < lst.length; i++) {
            lst[i] = rnd.nextInt(1, 101);
        }
        for (int i = 0; i < lst.length; i++) {
            s = String.valueOf(lst[i]);
            System.out.print(s + " ");
        }
        System.out.println();
        if (k >= 0) {
            s = String.valueOf(lst[lst.length -1]) + " = 0";
        }
        if (k >= 1) {
            s = String.valueOf(lst[lst.length -2]) + "x + " + s;
        }

        if (k >= 2) {
            int j = 2;
            for (int i = lst.length -3; i >= 0; i--) {
                s = String.valueOf(lst[i]) + "x^" + String.valueOf(j) + " + " + s;
                j++;
            }
        }
        System.out.println(s);
    }
}
