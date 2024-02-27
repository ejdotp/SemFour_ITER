class A
{
    private String name; //public data member of A class

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

class testLooseCoupling1
{
    public static void main(String[] args) {
        A a = new A();
        a.setName("Advitya");
        System.out.println("Name is " + a.getName());
    }
}
/*output:
cant initialize to a null dude
Name is not initialized
 */