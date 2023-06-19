package hw8.geometry;

import java.awt.*;

public class Dot extends Shape {
    private static final String NAME = "Dot";

    private final Point point;
    private Color color;

    public Dot(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Dot(int x, int y) {
        this(x, y, Color.BLACK);
    }

    public int getX() {
        return point.x;
    }

    public void setX(int x) {
        point.x = x;
    }

    public int getY() {
        return point.y;
    }

    public void setY(int y) {
        point.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
                "{x=" + point.x +
                ", y=" + point.y +
                ", color=" + color +
                '}';
    }
}
