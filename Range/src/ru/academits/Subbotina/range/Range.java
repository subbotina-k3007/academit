package ru.academits.Subbotina.range;

public class Range {
    double from;
    double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return (to - from);
    }

    @Override
    public String toString() {
        return "from " + from + " to " + to;
    }

    public boolean isInside(double number) {
        return (number >= from && number <= to);
    }

    public Range getIntersection(Range range2) {
        if (this.to <= range2.getFrom() || range2.getTo() <= this.from) {
            return null;
        }

        return new Range(Math.max(this.from, range2.getFrom()), Math.min(this.to, range2.getTo()));
    }

    public Range[] getUnion(Range range2) {
        if (this.to < range2.getFrom() || range2.getTo() < this.from) {
            return new Range[]{new Range(from, to), range2};
        } else {
            return new Range[]{new Range(Math.min(this.from, range2.getFrom()), Math.max(this.to, range2.getTo()))};
        }
    }

    public Range[] getDifference(Range range2) {
        if (this.to <= range2.getFrom() || range2.getTo() <= this.from) {
            return new Range[]{new Range(from, to)};
        } else if (this.from < range2.getFrom() && this.to > range2.getTo()) {
            return new Range[]{new Range(from, range2.getFrom()), new Range(range2.getTo(), to)};
        } else if (this.from < range2.getFrom() && this.to < range2.getTo()) {
            return new Range[]{new Range(from, range2.getFrom())};
        } else if (this.from > range2.getFrom() && this.to > range2.getTo()) {
            return new Range[]{new Range(range2.getTo(), to)};
        } else {
            return null;
        }
    }
}
