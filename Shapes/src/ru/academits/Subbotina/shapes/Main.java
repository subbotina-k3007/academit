package ru.academits.Subbotina.shapes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[ 7 ];

        shapes[ 0 ] = new Square(6.2);
        shapes[ 1 ] = new Triangle(1, 1, 5, 7.5, 7, 3.5);
        shapes[ 2 ] = new Square(7);
        shapes[ 3 ] = new Rectangle(2.5, 6);
        shapes[ 4 ] = new Circle(2.8);
        shapes[ 5 ] = new Rectangle(4, 3);
        shapes[ 6 ] = new Circle(5);

        Arrays.sort(shapes, new SortedByArea());
        System.out.println("Фигура с наибольшей площадью: " + shapes[ 6 ]);
        System.out.println("Фигура со второй по величине площадью: " + shapes[ 5 ]);
    }
}
