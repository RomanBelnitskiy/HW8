package hw8.geometry;

import java.awt.*;

public class Rectangle extends Shape {
    private static final String NAME = "Rectangle";

    private final Point start;
    private final Point end;
    private Color color;

    public Rectangle(int startX, int startY, int endX, int endY, Color color) {
        this.start = new Point(startX, startY);
        this.end = new Point(endX, endY);
        this.color = color;
    }

    public Rectangle(int startX, int startY, int endX, int endY) {
        this(startX, startY, endX, endY, Color.BLACK);
    }

    public Rectangle(Point start, Point end, Color color) {
        this(start.x, start.y, end.x, end.y, color);
    }

    public Rectangle(Point start, int width, int height, Color color) {
        this(start.x, start.y, start.x + width, start.y + height, color);
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

    public int getWidth() {
        return start.x > end.x ?
                start.x - end.x
                :
                end.x - start.x;
    }

    public int getHeight() {
        return start.y > end.y ?
                start.y - end.y
                :
                end.y - start.y;
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
                "{x=" + start.x +
                ", y=" + start.y +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", color=" + color +
                '}';
    }
}
