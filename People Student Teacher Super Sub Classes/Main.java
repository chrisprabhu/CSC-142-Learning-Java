public class Main
{
    public static void Main(String[] args) {
        Student testStudent = new Student("Bobby Brown", "bobb@comcast.net");
        testStudent.setId(args[0]);
        System.out.println(testStudent.toString());
    }
}
