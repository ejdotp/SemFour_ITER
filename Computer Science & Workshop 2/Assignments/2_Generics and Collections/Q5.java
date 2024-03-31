//Write a program to create a Student class with members name, rn, and total mark. Create an array of student objects and sort it using Bubble sort according to its rn. Note: Overload compareTo method of Comparable interface.

class Student implements Comparable<Student>
{
    private String name;
    private int rn; 
    private int totalMark;

    public Student(String name, int rn, int totalMark)
    {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String toString()
    {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }

    public int compareTo(Student otherStudent)
    {
        return Integer.compare(this.rn, otherStudent.rn); 
    }
}

public class Q5
{
    public static void bubbleSort(Student[] students)
    {
        int n = students.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {
                    // Swap elements
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args)
    {
        Student[] students = {
            new Student("Subham", 101, 450),
            new Student("Sidlu", 105, 380),
            new Student("Aayush", 103, 420)
        };

        System.out.println("Before sorting:");
        for (Student student : students)
            System.out.println(student);

        bubbleSort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students)
            System.out.println(student);
    }
}

/*Before sorting:
Student [name=Subham, rn=101, totalMark=450]
Student [name=Sidlu, rn=105, totalMark=380]
Student [name=Aayush, rn=103, totalMark=420]

After sorting:
Student [name=Subham, rn=101, totalMark=450]
Student [name=Aayush, rn=103, totalMark=420]
Student [name=Sidlu, rn=105, totalMark=380] */