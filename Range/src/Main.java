import ru.academits.Subbotina.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(3.2, 8.9);

        System.out.println("Первоначальное начало диапазона = " + range.getFrom());
        System.out.println("Первоначальный конец диапазона = " + range.getTo());
        System.out.println("Первоначальная длина диапазона = " + range.getLength());

        range.setFrom(1.2);
        range.setTo(15.7);

        System.out.println("Новое начало диапазона = " + range.getFrom());
        System.out.println("Новый конец диапазона = " + range.getTo());
        System.out.println("Новая длина диапазона = " + range.getLength());

        System.out.println(range.isInside(5.3));
        System.out.println(range.isInside(15.7));
        System.out.println(range.isInside(15.71));

        Range range2 = new Range(7, 19);

        Range range3 = range.getIntersection(range2);

        if (range3 == null) {
            System.out.println("null");
        } else {
            System.out.println(range3.toString());
        }

        Range range4 = new Range(-15.8, 1.2);
        System.out.println(Arrays.toString(range.getUnion(range4)));

        Range range5 = new Range(3, 5);
        System.out.println(Arrays.toString(range.getDifference(range5)));
    }
}
