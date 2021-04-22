package ru.academits.Subbotina.shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник с высотой = " + getWidth() + ", шириной = " + getHeight() + " и площадью = " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Rectangle s = (Rectangle) o;
        return width == s.width && height == s.height;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(width) + Double.hashCode(height);
    }
}
