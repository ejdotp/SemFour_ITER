class Employees2
{
    private int ID;
    private int age;
    private String name;
    private static int nextId = 1;

    public Employees2(String name,int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
   
    public void show(){
        System.out.println("ID = " + ID + ", Name = " + name + ", Age = " + age);
    }
   
    public void showNextId() {
        System.out.println("Next Employee ID will be = " + nextId);
    }
   
    protected void finalize() {
        --nextId; //In this case gc will call finalize()
    }             //for 2 times for 2objects
}

class GarbageModified
{
    // @SuppressWarnings("removal")
    public static void main(String[] args)
    {
        Employees2 E = new Employees2("ABC",56);
        E.show();
        E.showNextId();
        Employees2 F = new Employees2("DEF",45);
        F.show();
        F.showNextId();
        Employees2 G = new Employees2("GHI",25);
        G.show();
        G.showNextId();

        {
            Employees2 X = new Employees2("JKL",23);
            X.show();
            X.showNextId();
            Employees2 Y = new Employees2("MNO",21);
            Y.show();
            Y.showNextId();
            X = Y = null;
            System.gc();
            //System.runFinalization(); depreciated, supported by java8 or previous 
        }
        E.showNextId(); 
    }
}

/*ID = 1, Name = ABC, Age = 56
Next Employee ID will be = 2
ID = 2, Name = DEF, Age = 45
Next Employee ID will be = 3
ID = 3, Name = GHI, Age = 25
Next Employee ID will be = 4
ID = 4, Name = JKL, Age = 23
Next Employee ID will be = 5
ID = 5, Name = MNO, Age = 21
Next Employee ID will be = 6
Next Employee ID will be = 4*/