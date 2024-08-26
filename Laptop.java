package gb_Java.HW;

import java.util.Objects;

public class Laptop {
    String model;
    Integer memory;

    public Laptop(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }
    // метод заполнения ноутбуков
    public static Laptop add(String model, int memory) {
        Laptop laptop = new Laptop(model, memory);
        return laptop;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", memory=" + memory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return memory == laptop.memory && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, memory);
    }
}


