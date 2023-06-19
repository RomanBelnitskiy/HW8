package hw8.geometry;

import java.awt.*;
import java.util.Objects;

public class Polygon extends Shape {
    private static final String NAME = "Polygon";

    private final Point[] points;
    private Color color;

    public Polygon(Color color, Point... points) {
        this.color = color;
        this.points = points;
    }

    public Polygon(Point... points) {
        this(Color.BLACK, points);
    }

    public int getNumberOfPoints() {
        return points.length;
    }

    public Point getPoint(int index) {
        Objects.checkIndex(index, points.length);
        return points[index];
    }

    @Override
    public void draw() {
        System.out.println(NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME +
                "{numberOfPoints=" + points.length +
                ", color=" + color +
                '}';
    }
}
