package attestation;

import java.util.Scanner;

public class UI {

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.print("Пришло время дарить радость!\n" +
                "1 - Разыграть игрушку\n" +
                "2 - Добавить игрушку\n" +
                "3 - Изменить описание игрушки\n" +
                "4 - удалить игрушку\n" +
                "5 - Тест частоты выпадения\n" +
                "6 -  ВЫХОД\n" +
                "Выберите необходимое действие:");
        try {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 1 && number <= 6) {
                System.out.println("Число " + number + " входит в диапазон от 1 до 6.");
            } else {
                System.out.println("Число " + number + " не входит в диапазон от 1 до 6.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Пожалуйста, введите целое число.");
        }

    }
}
