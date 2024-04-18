class Divorce
{
    public static void main(String[] args)
    {
        String word1 = "ITER : A SOA University";
        String[] cut1 = word1.split(":");
        for(String a : cut1)
            System.out.println(a);
        System.out.println();

        String word2 = "word1$[word2#word3]word4";
        String[] cut2 = word2.split("[$#]+");//Symbols wont get detected without []
        for(String b : cut2)
            System.out.println(b);
        System.out.println();

        String word3 = "hello#world#how#are#you";
        String[] cut3 = word3.split("#", 2);
        for(String a : cut3)
            System.out.println(a);
        System.out.println();

        String word4 = "hello#world#how#are#you###";
        String[] cut4 = word4.split("#", 0);
        for(String b : cut4)
            System.out.println(b);
        System.out.println(cut4.length);
        System.out.println();

        String word5 = "hello#world#how#are#you###";
        String[] cut5 = word5.split("#", -2);//any negative number
        for(String b : cut5)
            System.out.println(b);
        System.out.println(cut5.length);
    }
}
/*
ITER 
 A SOA University

word1
[word2
word3]word4

hello
world#how#are#you

hello
world
how
are
you
5

hello
world
how
are
you



8
 */
