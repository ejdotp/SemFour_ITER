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

    }
}