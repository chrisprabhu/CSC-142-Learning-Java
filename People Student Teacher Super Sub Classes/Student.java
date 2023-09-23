import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student extends Person
{

    private String[] coursesTaken = new String[30];
    private double[] courseGrades = new double[30];
    private int nextCourseIndex; 

    public Student(String name, String email) {
        super(name, email);

    }

    public void recordCourseCompletion(String courseName, double courseGrade) {
        coursesTaken[nextCourseIndex] = courseName;
        courseGrades[nextCourseIndex] = courseGrade;
        nextCourseIndex++;
    }

    // Other methods
    public double getAverageGrade() {
        double gradeTotal = 0.0;
        for (int course = 0; course < nextCourseIndex; course++) {
            gradeTotal += courseGrades[course];
        }
        if (nextCourseIndex == 0) {
            return -99.0;
        }
        else {
            return gradeTotal / nextCourseIndex;
        }
    }

    public String toString() {
        String info = super.toString();
        info += "You found the Student with id: " + this.getId() + "\n";
        info += "Student has completed " + nextCourseIndex + " courses so far\n";
        info += "Current grade average is " + getAverageGrade();
        return info;
    }

    public boolean validId(String name) {
        return true;
    }

    public boolean readFile(File file) throws FileNotFoundException {
        return true;
    }

    public boolean writeFile(File file) throws FileNotFoundException {
        return true;
    }
}

