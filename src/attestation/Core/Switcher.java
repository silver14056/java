package attestation.Core;

import attestation.UI.Menu;

public class Switcher {
    public boolean sixPoints(int command) {
//        Menu menu = new Menu();
//        menu.mainMenu();// вызов меню
        ToyAction toyAction = new ToyAction();
        boolean flag = true;
        switch (command) {
            case 1:
                System.out.println("Разыграть игрушки");
                break;
            case 2:
                System.out.println("Добавить игрушку");
                toyAction.addToy();
                break;
            case 3:
                System.out.println("Изменить описание игрушки");
                toyAction.updateToy();
                break;
            case 4:
                System.out.println("Удалить игрушку");
                toyAction.deleteToy();
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
