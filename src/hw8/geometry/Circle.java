package hw8.geometry;

import java.awt.*;

public class Circle extends Shape {
    private static final String NAME = "Circle";

    private final Point center;
    private int radius;
    private Color color;

    public Circle(int centerX, int centerY, int radius, Color color) {
        this.center = new Point(centerX, centerY);
        this.radius = radius;
        this.color = color;
    }

    public Circle(int centerX, int centerY, int radius) {
        this(centerX, centerY, radius, Color.BLACK);
    }

    public int getCenterX() {
        return center.x;
    }

    public void setCenterX(int centerX) {
        this.center.x = centerX;
    }

    public int getCenterY() {
        return center.y;
    }

    public void setCenterY(int centerY) {
        this.center.y = centerY;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
                "{centerX=" + center.x +
                ", centerY=" + center.y +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}
