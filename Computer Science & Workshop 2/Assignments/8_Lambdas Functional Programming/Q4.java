// Q4. Create a functional interface Shape with a method double area()and a
// default method void printArea(). Implement the interface usinglambda
// expressions for different shapes. Define the Shape functionalinterface with
// an area method. Implement the interface for shapeslike circle, square, and
// rectangle using lambda expressions. Use thedefault method to print the area
// of each shape.

interface Shape {
    double area();

    default void printArea() {
        System.out.println("The area is: " + area());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape circle = () -> {
            double radius = 5;
            return Math.PI * radius * radius;
        };
        Shape square = () -> {
            double side = 4;
            return side * side;
        };
        Shape rectangle = () -> {
            double width = 4;
            double height = 7;
            return width * height;
        };
        System.out.println("Circle:");
        circle.printArea();
        System.out.println("Square:");
        square.printArea();
        System.out.println("Rectangle:");
        rectangle.printArea();
    }
}

/*Circle:
The area is: 78.53981633974483
Square:
The area is: 16.0
Rectangle:
The area is: 28.0 */