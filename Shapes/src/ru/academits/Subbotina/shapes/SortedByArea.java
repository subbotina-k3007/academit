package ru.academits.Subbotina.shapes;

import java.util.Comparator;

class SortedByArea implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}
