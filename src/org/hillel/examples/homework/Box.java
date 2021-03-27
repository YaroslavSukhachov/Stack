package org.hillel.examples.homework;

import java.util.Objects;

public class Box {
    protected String name = "";
    protected double width = 1;
    protected double height = 1;
    protected double length = 1;
    protected Material material;

    public Box() {
    }

    public Box(double width, double height, double length) {
        if (width <= 0 || height <= 0 || length <= 0) {
            System.out.println("Not valid data");
            return;
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double width, double height, double length, Material material) {
        this(width, height, length);
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Not valid data");
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Not valid data");
            return;
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Not valid data");
            return;
        }
        this.length = length;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double volume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 &&
                Double.compare(box.height, height) == 0 &&
                Double.compare(box.length, length) == 0 &&
                material == box.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, length, material);
    }
}
