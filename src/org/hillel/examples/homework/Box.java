package org.hillel.examples.homework;

public class Box {
    private double width = 1;
    private double height = 1;
    private double length = 1;
    private Material material;

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
}
