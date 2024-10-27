package attestation.Core;

import java.util.Scanner;

public class ToyAction {

    public void addToy(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название игрушки: ");
        String name = sc.nextLine();
        System.out.println("Введите шанс выпадения: ");
        int weight = sc.nextInt();
        System.out.println("Введите id: ");
        int id = sc.nextInt();

        Toy toy = new Toy(name, id, weight);

        System.out.println(toy.exportToFile());
    }

    public void readToy(){
        System.out.println("читаем из файла игрушки");
    }

    public void deleteToy(){
        System.out.println("Удаляем игрушку");
    }

    public void updateToy(){
        System.out.println("Обновляем игрушку");
    }

    public void showToy(){
        System.out.println("Показываем игрушку");
    }

    public void showAllToy(){
        System.out.println("Показываем все игрушки");
    }


}
