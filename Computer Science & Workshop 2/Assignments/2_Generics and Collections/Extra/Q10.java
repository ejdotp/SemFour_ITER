//Q10. Create a class Student having member variable name, age, and mark and required get and set methods. Create a LinkedList of Student type and perform the below operation on it.(a.) Display the list(b.) Ask the user to enter a Studentobject and print the existence of the object. Specify is the object is search according to reference or contain.(c.) Remove a specified Student object.(d.) Count the number of object present in the list.(e.)Override equals method checking if the two Student objects share all the same values.  

import java.util.LinkedList;
import java.util.Scanner;

class Student10
{
    private String name;
    private int age;
    private double mark;

    public Student10(String name, int age, double mark)
    {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student10 student = (Student10) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0
                && name.equals(student.name);
    }
}

class StudentLinkedList
{
    public static void displayList(LinkedList<Student10> studentList)
    {
        for (Student10 student : studentList)
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
    }

    public static void main(String[] args)
    {
        LinkedList<Student10> studentList = new LinkedList<>();
        studentList.add(new Student10("Dishant", 21, 85.5));
        studentList.add(new Student10("Sujan", 21, 75.0));
        studentList.add(new Student10("Ashutosh", 21, 90.0));
        studentList.add(new Student10("Arman", 21, 70.0));
        System.out.println("Student list:");
        displayList(studentList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a student details to search (name, age, mark):");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Mark: ");
        double mark = scanner.nextDouble();
        scanner.nextLine(); // consume the newline
        Student10 searchStudent = new Student10(name, age, mark);
        boolean isReferenceExist = studentList.contains(searchStudent);
        boolean isValueExist = false;
        for (Student10 student : studentList) {
            if (student.equals(searchStudent)) {
                isValueExist = true;
                break;
            }
        }
        System.out.println("Existence using reference: " + isReferenceExist);
        System.out.println("Existence using value: " + isValueExist);
        System.out.println("\nEnter the student details to remove (name, age, mark):");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Mark: ");
        mark = scanner.nextDouble();
        scanner.nextLine(); // consume the newline
        Student10 removeStudent = new Student10(name, age, mark);
        boolean isRemoved = studentList.remove(removeStudent);
        if (isRemoved)
            System.out.println("Student removed successfully.");
        else
            System.out.println("Student not found.");
        System.out.println("Number of objects in the list: " +
                studentList.size());
        scanner.close();
    }
}
