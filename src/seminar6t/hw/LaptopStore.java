package seminar6t.hw;

import java.util.*;


public class LaptopStore {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(8, 256, "Windows 10", "Black"));
        laptops.add(new Laptop(16, 512, "Windows 11", "Silver"));
        laptops.add(new Laptop(32, 1024, "MacOS", "White"));
        laptops.add(new Laptop(8, 256, "Ubuntu", "Black"));
        laptops.add(new Laptop(16, 512, "Windows 11", "Gray"));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ram");
        criteria.put(2, "hdd");
        criteria.put(3, "os");
        criteria.put(4, "color");

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        boolean continueFiltering = true;

        while (continueFiltering) {
            System.out.println("Введите номер критерия для фильтрации:");

            for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            int criterion = scanner.nextInt();
            scanner.nextLine();
            switch (criterion) {
                case 1:
                    System.out.println("Введите минимальное значение ОЗУ (в ГБ): ");
                    filters.put("ram", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Введите минимальное значение Объема ЖД (в ГБ): ");
                    filters.put("hdd", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Введите операционную систему: ");
                    filters.put("os", scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    filters.put("color", scanner.nextLine());
                    break;
                default:
                    System.out.println("Неверный номер критерия.");

            }
            System.out.println("Хотите добавить критерий в фильтр? (y/n)");
            String answer = scanner.nextLine();
            continueFiltering = answer.equals("y");
        }
        filterLaptops(laptops, filters);
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean matches = true;

            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")) {
                matches = false;
            }

            if (filters.containsKey("hdd") && laptop.getHdd() < (int) filters.get("hdd")) {
                matches = false;
            }

            if (filters.containsKey("os") && !laptop.getOs().equals(filters.get("os"))) {
                matches = false;
            }

            if (filters.containsKey("color") && !laptop.getColor().equals(filters.get("color"))) {
                matches = false;
            }

            if (matches) {
                System.out.println(laptop);
            }
        }
    }
}
