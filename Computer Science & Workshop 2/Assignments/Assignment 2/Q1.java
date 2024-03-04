//Write a program to create a Student class that has members, name, roll number, and age. Design the Student class in such a way that it can take the roll number as an integer or string. Create a driver class that creates student objects and invokes the methods.

class Student<T>
{
    private String name;
    private T roll; 
    private int age;

    public Student(String name, T roll, int age)
    {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public void displayStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Age: " + age);
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        Student<Integer> student1 = new Student<>("Subham", 104531, 14);
        Student<String> student2 = new Student<>("Sidlu", "S22034", 71); 

        System.out.println("Student 1:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}

/*Student 1:
Name: Subham
Roll Number: 104531
Age: 14

Student 2:
Name: Sidlu
Roll Number: S22034
Age: 71 */
