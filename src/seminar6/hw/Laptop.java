package seminar6.hw;

public class Laptop {
    //поля, геттерыб конструктор, из класса Object переопределить методы: toString, equals, hashCode
    private String model;
    private String color;
    private String memory;
    private String storage;
    private String os;

    //конструктор c параметрами
    public Laptop(String model, String color, String memory, String storage, String os) {
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.os = os;
        this.storage = storage;
    }

    //конструктор без параметров
    public Laptop(String model) {
        this.model = model;
    }

    //геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override //переопределяем метод toString()
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    @Override //переопределяем метод equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        return model.equals(laptop.model) && color.equals(laptop.color) &&
                memory.equals(laptop.memory) && storage.equals(laptop.storage) && os.equals(laptop.os);
    }

    @Override //переопределяем метод hashCode()
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + memory.hashCode();
        result = 31 * result + storage.hashCode();
        result = 31 * result + os.hashCode();
        return result;
    }
}
