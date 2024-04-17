import javax.print.attribute.Size2DSyntax;

public class Tester {
    public static void main(String[] args) {
        String s1 = "vwefwe ";
        String s2 = "bsetrhsrt ";
        String s3 = "vaergeraa ";
        String s4 = s1.concat(s2).concat(s3);
        System.out.println(s4);
        s4 = s1 + s2 + s3;
        System.out.println(s4);
    }
}

/*vwefwe bsetrhsrt vaergeraa 
vwefwe bsetrhsrt vaergeraa  */
