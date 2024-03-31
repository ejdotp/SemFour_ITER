// Design a Java class called Rectangle with private attributes length and width. Include a
// constructor to initialize these attributes, as well as setter and getter methods for each attribute.
// Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a
// main method to create an object of the Rectangle class, set values for its attributes, and display
// the area and perimeter

class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double Area()
    {
        return length * width;
    }

    public double Perimeter()
    {
        return 2 * (length + width);
    }
}

public class Q2
{
    public static void main(String[] args)
    {
        Rectangle property = new Rectangle();

        property.setLength(10.0);
        property.setWidth(3.5);

        System.out.println("Area: " + property.Area() + "\nPerimeter: " + property.Perimeter());
    }
}

/*
output:
Area: 35.0
Perimeter: 27.0
*/
