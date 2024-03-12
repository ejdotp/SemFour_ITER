import java.util.Vector;
class VikashVector
{
    public static void main(String[] args)
    {
        Vector<Integer> in = new Vector<Integer>();
        in.add(200);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        in.add(800);

        System.out.println("Values in Vector: " + in);
        System.out.println("Remove first: " + in.remove((Integer)200));
        System.out.println("Values in Vector: " + in);
        System.out.println("Remove 4th: " + in.remove(4));
        System.out.println("Values in Vector: " + in);
        in.removeElement(5);
        System.out.println("Values in Vector: " + in);
        System.out.println("Hashcode of this Vector: " + in.hashCode());
        System.out.println("Element of 1st: " + in.get(1));
    }
}
/*
Values in Vector: [200, 400, 500, 600, 700, 800]
Remove first: true
Values in Vector: [400, 500, 600, 700, 800]
Remove 4th: 800
Values in Vector: [400, 500, 600, 700]
Values in Vector: [400, 500, 600, 700]
Hashcode of this Vector: 13339721
Element of 1st: 500
 */