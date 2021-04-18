import ru.academits.Subbotina.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(3.2, 8.9);

        System.out.println ("Первоначальное начало диапазона = " + range.getFrom());
        System.out.println ("Первоначальный конец диапазона = " + range.getTo());
        System.out.println ("Первоначальая длина диапазона = " + range.getLength());

        range.setFrom(1.2);
        range.setTo(15.7);

        System.out.println ("Новое начало диапазона = " + range.getFrom());
        System.out.println ("Новый конец диапазона = " + range.getTo());
        System.out.println ("Новая длина диапазона = " + range.getLength());

        System.out.println (range.isInside(5.3));
        System.out.println (range.isInside(15.7));
        System.out.println (range.isInside(15.71));

    }
}
