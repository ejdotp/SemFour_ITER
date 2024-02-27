class A
{
    public String name; //public data member of A class

    public String getName()
    {
        if(name!=null) //checking a valid access of intance variable, "name"
            return name;
        else
            return "not initialized";
    }

    public void setName(String s)
    {
        if(s==null) //checking a valid setting of instance variable, "name"
            System.out.println("cant initialize to a null dude");
        else
            name = s;
    }
}

class testTightCoupling1
{
    public static void main(String[] args) {
        A a = new A();
        a.name = null;
        System.out.println("Name is " + a.name);
    }
}
/*
Name is null
 */