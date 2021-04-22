package ru.academits.Subbotina.shapes;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius * 2;
    }

    public double getHeight() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Окружность с радиусом = " + radius + " и площадью = " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Circle s = (Circle) o;
        return radius == s.radius;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }
}
