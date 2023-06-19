package hw8.geometry;

import java.awt.*;

public class Line extends Shape {
    private static final String NAME = "Line";

    private final Point start;
    private final Point end;
    private Color color;

    public Line(int startX, int startY, int endX, int endY, Color color) {
        this.start = new Point(startX, startY);
        this.end = new Point(endX, endY);
        this.color = color;
    }

    public Line(int startX, int startY, int endX, int endY) {
        this(startX, startY, endX, endY, Color.BLACK);
    }

    public int getStartX() {
        return start.x;
    }

    public void setStartX(int startX) {
        start.x = startX;
    }

    public int getStartY() {
        return start.y;
    }

    public void setStartY(int startY) {
        start.y = startY;
    }

    public int getEndX() {
        return end.x;
    }

    public void setEndX(int endX) {
        end.x = endX;
    }

    public int getEndY() {
        return end.y;
    }

    public void setEndY(int endY) {
        end.y = endY;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
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
                "{startX=" + start.x +
                ", startY=" + start.y +
                ", endX=" + end.x +
                ", endY=" + end.y +
                ", color=" + color +
                '}';
    }
}
