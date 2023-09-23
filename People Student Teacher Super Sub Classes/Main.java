import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Person collegePeople[] = new Person[5];
        Student testStudent = new Student("Bobby Brown", "bobb@comcast.net");
        testStudent.setId("345234511");
        testStudent.recordCourseCompletion("Algebra II", 3.9);
        testStudent.recordCourseCompletion("Geometry I", 3.7);

        Person testPerson = new Student("Susie Smith", "suzmith@amazon.com");
        testPerson.setId("123456789");

        Teacher testTeacher = new Teacher("Samantha Smith", "sammys@microsoft.com");
        testTeacher.setId("000000000");
        testTeacher.addCourse("Algebra II");
        System.out.println(testTeacher);

        // can't do this testPerson.recordCourseCompletion("Sociology I", 4.0);
        // ((Student)testPerson).recordCourseCompletion("Sociology I", 4.0);

        System.out.println(testPerson);

        collegePeople[0] = testStudent;
        collegePeople[1] = testTeacher;
        collegePeople[3] = testPerson;

        for (int personIndex = 0; personIndex<3; personIndex++) {
            System.out.println(collegePeople[personIndex]);
        }

    }

    public static String testStudentGetName() {
        Student testStudent = new Student("Bobby Brown", "bobb@comcast.net");
        return testStudent.getName();
    }

    public static void writeFile(File file) {
        
    }
    
    public static void readFile(File file) {
        
    }
    
    public static void animals() {
        Rabbit minny = new Rabbit();
        minny.flee();
     
        Hawk hunter = new Hawk();
        hunter.hunt();
        
    }


}
