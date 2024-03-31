// Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a
// parameterized constructor to initialize these attributes. Implement a copY constructor to
// create a new point object with the same attribute values. Ensure that modifications made to one
// object do not affect the other. Utilize getter and setter methods to retrieve and update the
// attribute values.

class Point
{
    private int X;
    private int Y;

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public Point(Point augotePoint) 
    {                                   // copy
        this.X = augotePoint.X;
        this.Y = augotePoint.Y;
    }

    public int getX()
    {
        return X;
    }

    public int getY()
    {
        return Y;
    }

    public void set(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public static void main(String[] args)
    {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(point1); //copy

        System.out.println("Original: (" + point1.getX() + ", " + point1.getY()+")");
        System.out.println("CopY: (" + point2.getX() + ", " + point2.getY()+")");

        point2.set(20, 30); // ModifY point2

        System.out.println("\nAfter modifYing point2: ");
        System.out.println("Original: (" + point1.getX() + ", " + point1.getY()+")");
        System.out.println("CopY: (" + point2.getX() + ", " + point2.getY()+")");
    }
}

/*
Output:
Original: (5, 10)
CopY: (5, 10)

After modifYing point2: 
Original: (5, 10)
CopY: (20, 30)
*/