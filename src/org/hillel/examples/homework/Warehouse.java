package org.hillel.examples.homework;

public class Warehouse {
    private Box[] array;
    private int amount = 0;

    public Warehouse() {
        array = new Box[10];
    }

    public Warehouse(int size) {
        array = new Box[size];
    }

    public void addBox(Box box) {
        if (amount + 1 > array.length) {
            System.out.println("Склад переполнен");
            return;
        }

        array[amount++] = box;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("Warehouse{\n");
        for (int i = 0; i < amount; i++) {
            result.append("\t")
                    .append((i + 1) + ". ")
                    .append(array[i].toString())
                    .append("\n");
        }
        result.append("}");

        return result.toString();
    }
}
