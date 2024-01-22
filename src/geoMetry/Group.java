package geoMetry;

import java.util.ArrayList;

public class Group {
	ArrayList<Drawable> drawable = new ArrayList<>();

    void addShape(Drawable shape) {
        drawable.add(shape);
    }

    void removeShape(Drawable shape) {
        drawable.remove(shape);
    }

    double calculateTotalArea() {
        double totalArea = 0;
        for (Drawable shape : drawable) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    double calculateTotalCircumference() {
        double totalCircumference = 0;
        for (Drawable shape : drawable) {
            totalCircumference += shape.circumference();
        }
        return totalCircumference;
    }

    Drawable findLargestShape() {
        if (drawable.isEmpty()) {
            return null;
        }
        Drawable largestShape = drawable.get(0);
        for (Drawable shape : drawable) {
            if (shape.area() > largestShape.area()) {
                largestShape = shape;
            }
        }

        return largestShape;
    }

    void printAllShapes() {
        for (Drawable shape : drawable) {
            System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
        }
    }
}
