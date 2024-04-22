//Au question pakeibaku ichha houni TT

class College
{
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc)
    {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName()
    {
        return collegeName;
    }

    public String getCollegeLoc()
    {
        return collegeLoc;
    }
}

class Student
{
    private int studentId;
    private String studentName;
    private College college;
    
    public Student(int studentId, String studentName, College college)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college; 
    }

    public void displayStudentInfo()
    {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println("----------------------"); 
    }
}

class Mains
{
    public static void main(String[] args)
    {
        // Create College objects
        College college1 = new College("ABC University", "California");
        College college2 = new College("XYZ Institute", "New York");

        // Create Student objects
        Student student1 = new Student(101, "Alice", college1);
        Student student2 = new Student(102, "Bob", college2);

        // Display college details
        System.out.println("College 1: " + college1.getCollegeName() + " - " + college1.getCollegeLoc());
        System.out.println("College 2: " + college2.getCollegeName() + " - " + college2.getCollegeLoc());
        System.out.println("----------------------");

        // Display student details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}

/*
Output:

College 1: ABC University - California
College 2: XYZ Institute - New York
----------------------
Student ID: 101
Student Name: Alice
College Name: ABC University
College Location: California
----------------------
Student ID: 102
Student Name: Bob
College Name: XYZ Institute
College Location: New York
---------------------- */