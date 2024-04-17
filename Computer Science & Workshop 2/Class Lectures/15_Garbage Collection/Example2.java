class Employees
{
    private int ID;
    private int age;
    private String name;
    private static int nextId=1;

    public Employees(String name,int age) {
        this.name=name;
        this.age=age;
        this.ID=nextId++;
    }
   
    public void show(){
        System.out.println(ID+" "+name+" "+age);
    }
   
    public void showNextId() {
        System.out.println(nextId);
    }
   
    protected void finalize() {
        --nextId;
    }
}

public class garbagecollection1
{
    public static void main(String[] args)
    {
        Employees E=new Employees("aayush",20);
        E.show();
        E.showNextId();
        Employees F=new Employees("Ej",120);
        F.show();
        F.showNextId();
        Employees G=new Employees("Simplu",220);
        G.show();
        G.showNextId();
        {
            Employees X=new Employees("Rahul",19);
            X.show();
            X.showNextId();
            Employees Y=new Employees("Udipta",76);
            Y.show();
            Y.showNextId();
            X=Y=null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId(); 
    }
}

/*1 aayush 20
2
2 Ej 120
3
3 Simplu 220
4
4 Rahul 19
5
5 Udipta 76
6
4 */