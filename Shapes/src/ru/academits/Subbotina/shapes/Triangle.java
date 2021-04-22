package ru.academits.Subbotina.shapes;

import java.util.Arrays;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    public double getArea() {
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    public double[] getSides() {
        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double side3 = Math.sqrt(Math.pow((x2 - x2), 2) + Math.pow((y2 - y2), 2));

        return new double[]{side1, side2, side3};
    }

    public double getPerimeter() {
        double[] sides = this.getSides();

        return sides[0] + sides[1] + sides[2];
    }


    @Override
    public String toString() {
        return "Треугольник со сторонами: " + Arrays.toString(this.getSides()) + " и площадью = " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Triangle s = (Triangle) o;

        double[] thisSides = this.getSides();
        double[] oSides = s.getSides();

        return thisSides[0] == oSides[0] && thisSides[1] == oSides[1] && thisSides[2] == oSides[2];
    }

    @Override
    public int hashCode() {
        double[] sides = this.getSides();

        return Double.hashCode(sides[0]) + Double.hashCode(sides[1]) + Double.hashCode(sides[2]);
    }
}
