package seminar6t.hw;

import java.util.Objects;

public class Laptop {

    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Laptop{" + "RAM=" + ram + "," +
                " HDD=" + hdd + ", OS=" + os +
                ", Color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ram;
        hash = 79 * hash + this.hdd;
        hash = 79 * hash + Objects.hashCode(this.os);
        hash = 79 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Laptop other = (Laptop) obj;
        return ram == other.ram && hdd == other.hdd && os.equals(other.os) && color.equals(other.color);

    }
}
