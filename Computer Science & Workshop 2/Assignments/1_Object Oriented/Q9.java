//Design a Java program for managing student enrollment in a university, adhering to the principles of loose coupling and high cohesion. Your program should include classes for representing students (`Student`), courses (`Course`), and enrollment management (`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly through an interface class (`EnrollmentSystem`). Implement methods for enrolling and dropping students from courses, and displaying enrollment details. Create a `Main` class to demonstrate the system's functionality, with appropriate error handling and user-friendly output messages. Provide comments in your code explaining how loose coupling and high cohesion are maintained throughout the implementation.

import java.util.*;

interface EnrollmentSystem
{                                                                    // Interface for enrollment operations (Loose Coupling)
    void enrollStudent(student student, Course course);

    void dropStudent(student student, Course course);

    void displayEnrollmentDetails();
}

class student
{
    private String studentId;
    private String studentName;

    public student(String studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Course
{
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName)
    {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment implements EnrollmentSystem                   // Enrollment logic with interaction through interface (High Cohesion)
{
    private List<student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment()
    {
        this.enrolledStudents = new ArrayList<student>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollStudent(student student, Course course)
    {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Enrolled student " + student.getStudentName() + " in course " + course.getCourseName());
    }

    public void dropStudent(student student, Course course)
    {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Dropped student " + student.getStudentName() + " from course " + course.getCourseName());
        } else
            System.out.println("Student not enrolled in the specified course.");
    }

    public void displayEnrollmentDetails()
    {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++)
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() + ", Course: " + enrolledCourses.get(i).getCourseName());
    }
}

class Main
{
    public static void main(String[] args)
    {
        EnrollmentSystem enrollmentSystem = new Enrollment();
        student student1 = new student("6732", "Rahul Premika");
        student student2 = new student("5246", "Simp Mohanty");
        Course course1 = new Course("3733", "GEDI");
        Course course2 = new Course("8443", "BULA BULI");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}

/*
Enrolled student Rahul Premika in course GEDI
Enrolled student Simp Mohanty in course BULA BULI
Enrollment Details:
Student: Rahul Premika, Course: GEDI
Student: Simp Mohanty, Course: BULA BULI
Student not enrolled in the specified course.
Enrollment Details:
Student: Rahul Premika, Course: GEDI
Student: Simp Mohanty, Course: BULA BULI
*/

