package hw8.printer;

import hw8.geometry.Shape;

public final class ShapePrinter {
    public static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
