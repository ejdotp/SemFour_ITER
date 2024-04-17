class Employee
{
    private int ID;
    private int age;
    private String name;
    private static int nextId = 1;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show() {
        System.out.println("ID = " + ID + ", Name = " + name + ", Age = " + age);
    }

    public void showNextId() {
        System.out.println("Next Employee Id will be = " + nextId);
    }
}

class garbage
{
    public static void main(String[] args)
    {
        Employee E = new Employee("ABC", 56);
        E.show();
        E.showNextId();
        Employee F = new Employee("DEF", 45);
        F.show();
        F.showNextId();
        Employee G = new Employee("GHI", 25);
        G.show();
        G.showNextId();

        {   //It is a subblock to keep all those interns.
            Employee X = new Employee("JKL", 23);
            X.show();
            X.showNextId();
            Employee Y = new Employee("MNO", 21);
            Y.show();
            Y.showNextId();
        }
        
        E.showNextId();
    }
}

/*ID = 1, Name = ABC, Age = 56
Next Employee Id will be = 2
ID = 2, Name = DEF, Age = 45
Next Employee Id will be = 3
ID = 3, Name = GHI, Age = 25
Next Employee Id will be = 4
ID = 4, Name = JKL, Age = 23
Next Employee Id will be = 5
ID = 5, Name = MNO, Age = 21
Next Employee Id will be = 6
Next Employee Id will be = 6*/
