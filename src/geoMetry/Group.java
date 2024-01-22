package geoMetry;

import java.util.ArrayList;

public class Group {
	ArrayList<Drawable> drawable = new ArrayList<>();

    /**
     * adds shape to field
     * @param shape
     */
	void addShape(Drawable shape) {
        drawable.add(shape);
    }
	
	/**
	 * removes shape from field
	 * @param shape
	 */
    void removeShape(Drawable shape) {
        drawable.remove(shape);
    }
    
    /**
     * calculates the area of all the shapes on the field together
     * @return
     */
    double calculateTotalArea() {
        double totalArea = 0;
        for (Drawable shape : drawable) {
            totalArea += shape.area();
        }
        return totalArea;
    }
    
    /**
     * calculates Total Circumference of all the shapes on the field
     * @return
     */
    double calculateTotalCircumference() {
        double totalCircumference = 0;
        for (Drawable shape : drawable) {
            totalCircumference += shape.circumference();
        }
        return totalCircumference;
    }

    /**
     * returns the shape with the biggest Circumference on the field
     * @return
     */
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

    /**
     * gives out all the shapes and their position
     */
    void printAllShapes() {
        for (Drawable shape : drawable) {
            System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
        }
    }
}
