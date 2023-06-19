package hw8;

import hw8.geometry.*;
import hw8.geometry.Point;
import hw8.geometry.Polygon;
import hw8.geometry.Rectangle;
import hw8.geometry.Shape;
import hw8.printer.ShapePrinter;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Dot(1, 1),
                new Line(2, 2, 2, 3),
                new Circle(3, 3, 5, Color.GREEN),
                new Triangle(10, 10, 8, 12, 12, 12),
                new Rectangle(4, 4, 5, 5),
                new Polygon(
                        new Point(6, 6),
                        new Point(8, 6),
                        new Point(8, 8),
                        new Point(6, 8),
                        new Point(5, 7)
                )
        };

        ShapePrinter.print(shapes);
    }
}