class GetThreadName
{
    public static void main(String[] args)
    {
        Thread t = new Thread("My 1st Thread");
        t.start();
        String st = t.getName();
        System.out.println(st);
    }    
}

/*My 1st Thread */
