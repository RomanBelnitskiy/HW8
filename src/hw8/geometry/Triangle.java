package hw8.geometry;

import java.awt.*;

public class Triangle extends Shape {
    private static final String NAME = "Triangle";

    private final Point[] points = new Point[3];
    private Color color;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        this.points[0] = new Point(x1, y1);
        this.points[1] = new Point(x2, y2);
        this.points[2] = new Point(x3, y3);
        this.color = color;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(x1, y1, x2, y2, x3, y3, Color.BLACK);
    }

    public Triangle(Point p1, Point p2, Point p3, Color color) {
        this(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, color);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);
    }

    public int getX1() {
        return points[0].x;
    }

    public void setX1(int x1) {
        points[0].x = x1;
    }

    public int getY1() {
        return points[0].y;
    }

    public void setY1(int y1) {
        points[0].y = y1;
    }

    public int getX2() {
        return points[1].x;
    }

    public void setX2(int x2) {
        points[1].x = x2;
    }

    public int getY2() {
        return points[1].y;
    }

    public void setY2(int y2) {
        points[1].y = y2;
    }

    public int getX3() {
        return points[2].x;
    }

    public void setX3(int x3) {
        points[2].x = x3;
    }

    public int getY3() {
        return points[2].y;
    }

    public void setY3(int y3) {
        points[2].y = y3;
    }

    public Point getPoint1() {
        return points[0];
    }

    public Point getPoint2() {
        return points[1];
    }

    public Point getPoint3() {
        return points[2];
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
                "{x1=" + points[0].x +
                ", y1=" + points[0].y +
                ", x2=" + points[1].x +
                ", y2=" + points[1].y +
                ", x3=" + points[2].x +
                ", y3=" + points[2].y +
                ", color=" + color +
                '}';
    }
}
