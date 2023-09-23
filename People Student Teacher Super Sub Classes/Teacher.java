import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teacher extends Person
{
    private String[] coursesTeaching = new String[10];
    private int nextCourseIndex;

    public Teacher(String name, String email){
        super(name, email);
    }

    public void addCourse(String courseName) {
        coursesTeaching[nextCourseIndex] = courseName;
        nextCourseIndex++;
    }

    public String toString() {
        String teacherString = super.toString() + "You found Teacher " + this.getName() + ", Courses Taught:\n";
        // System.out.println(coursesTeaching[0]);
        for (int course = 0; course < nextCourseIndex; course++) {
            teacherString += coursesTeaching[course] + "\n";
        }
        return teacherString;

    }

    // ISavable Required Files
    public boolean readFile(File file) throws FileNotFoundException {
        // write the basic Person stuff first
        super.readFile(file);
        // now handle Teacher's responsibilities
        Scanner inFileScan = new Scanner(file);
        
        // zero out current term course list
        nextCourseIndex = 0;
        for (int courseIndex = 0; courseIndex < coursesTeaching.length; courseIndex++) {
            coursesTeaching[courseIndex] = null;
        }
        
        // read the count of courses, then the course list
        int coursesThisTerm = inFileScan.nextInt();
        for (int courseIndex = 0; courseIndex < coursesThisTerm; courseIndex++) {
            coursesTeaching[courseIndex] = inFileScan.nextLine();
        }
        
        // TODO: add error/exception handling
        return true;
    }
}
