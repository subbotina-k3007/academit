package ru.academits.Subbotina.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной = " + side + " и площадью = " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Square s = (Square) o;
        return side == s.side;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(side);
    }
}
