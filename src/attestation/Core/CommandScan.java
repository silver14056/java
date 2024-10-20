package attestation.Core;

import java.util.Scanner;

public class CommandScan {

    public int cs(int max) {
        try {
            Scanner scanner = new Scanner(System.in);
            int command = Integer.parseInt(scanner.nextLine());

            if (command >= 1 && command <= max) {
                return command;
            } else {
                System.out.println("Число " + command + " не входит в диапазон от 1 до " + max + ".");
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Пожалуйста, введите целое число.");
            return -1;
        }
    }
}
