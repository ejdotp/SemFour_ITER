public class Equally
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        System.out.println(c1.equals(c2));
    }
}

class Complex
{
    private double re, im;
    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public boolean equals(Object o)
    {
        if(o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }
}

/*
Output:
true
 */