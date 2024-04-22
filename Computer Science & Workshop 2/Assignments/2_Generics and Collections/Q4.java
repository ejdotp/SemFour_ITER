//Write a program to create a Student class with members name, rn, and totalMark. Create an array of student objects and search a student object using linear search from the array. Note: Overload compareTo method of Comparable interface.

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

    public int getRn() {
        return rn;
    }

    public String toString() {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }

    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn); // Compare based on roll number (rn)
    }
}

public class Q4
{
    public static Student linearSearch(Student[] students, int targetRn)
    {
        for (Student student : students) {
            if (student.getRn() == targetRn) {
                return student;
            }
        }
        return null; // Student not found
    }

    public static void main(String[] args)
    {
        Student[] students = {
            new Student("Subham", 101, 450),
            new Student("Sidlu", 102, 380),
            new Student("Aayush", 103, 420)
        };

        int rnToSearch = 102;
        Student searchResult = linearSearch(students, rnToSearch);

        if (searchResult != null) {
            System.out.println("Student found: " + searchResult + ":)");
        } else {
            System.out.println("Student with roll number " + rnToSearch + " not found. TT");
        }
    }
}

/*Student found: Student [name=Sidlu, rn=102, totalMark=380] :)*/