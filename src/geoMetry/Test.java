package geoMetry;

public class Test {

    public static void main(String[] args) {
        // Create objects of Rectangle, Circle, and Triangle
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);
        rectangle.setX(1);
        rectangle.setY(2);

        Circle circle = new Circle();
        circle.setRadius(4);
        circle.setX(3);
        circle.setY(4);

        Triangle triangle = new Triangle();
        triangle.setLength(6);
        triangle.setHight(2);
        triangle.setX(5);
        triangle.setY(6);

        // Create a Group and add the shapes
        Group shapeGroup = new Group();
        shapeGroup.addShape(rectangle);
        shapeGroup.addShape(circle);
        shapeGroup.addShape(triangle);

        // Calculate and print total area and circumference of all shapes
        System.out.println("Total Area of all shapes: " + shapeGroup.calculateTotalArea());
        System.out.println("Total Circumference of all shapes: " + shapeGroup.calculateTotalCircumference());

        // Find and print the largest shape
        Drawable largestShape = shapeGroup.findLargestShape();
        if (largestShape != null) {
            System.out.println("Largest Shape: " + largestShape.getClass().getSimpleName());
        } else {
            System.out.println("No shapes in the group.");
        }

        // Print all shapes and their positions
        shapeGroup.printAllShapes();
    }
}
