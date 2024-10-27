package attestation.Core;

import java.io.FileWriter;
import java.io.IOException;

public class Toy {
    private String name;
    private int id;
    private int weight;

    public Toy() {
        this.name = "";
    }

    public Toy(String name, int id, int weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() { return name;}

    public void setName(String name) {this.name = name;}

    public int getId() { return id;}

    public void setId(int id) {this.id = id;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString() {
        return "Игрушка {" +
                "Название: " + name + "|" +
                "id :" + id + "|" +
                "Шанс: " + weight + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        return name.equals(toy.name) && id == toy.id && weight == toy.weight;
    }


    @Override //переопределяем метод hashCode()
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id*13;
        result = 31 * result + weight*13;
        return result;
    }

    public String exportToFile() {
        try {
            FileWriter writer = new FileWriter("src/attestation/Core/Toys.txt", true);
            String line = this.id + ";" + this.name + ";" + this.weight;
            writer.write(line);
            writer.write(System.lineSeparator());
            writer.close();
            return "Игрушка успешно экспортирована в файл.";
        } catch (IOException e) {
            return "Произошла ошибка при экспортировании игрушки в файл.";
        }
    }
}
