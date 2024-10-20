package attestation.Core;

import attestation.UI.Menu;

public class Switcher {
    public boolean sixPoints(int command) {
        Menu menu = new Menu();
        boolean flag = true;
        switch (command) {
            case 1:
                System.out.println("Разыграть игрушку");
                break;
            case 2:
                System.out.println("Добавить игрушку");
                break;
            case 3:
                System.out.println("Изменить описание игрушки");
                break;
            case 4:
                System.out.println("Удалить игрушку");
                break;
            case 5:
                System.out.println("Тест частоты выпадения");
                break;
            case 6:
                System.out.println("ВЫХОД");
                flag = false;
            default:
                break;
        }
        return flag;
    }
}
