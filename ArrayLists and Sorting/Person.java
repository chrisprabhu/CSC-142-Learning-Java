import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person implements Comparable<Person> {
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge()             {return age;}

    public String getFirstName()    {return firstName;}

    public String getLastName()     {return lastName;}

    public String toString() {
        return "Name = " + firstName + " " + lastName + ", age = " + age;
    }

    public int compareTo(Person other) {
        return age - other.age;
    }
    
    //public boolean equals(Person other) {
     //   return age == other.age;
    //}
}
