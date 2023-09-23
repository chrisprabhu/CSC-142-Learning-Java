import java.util.ArrayList;
import java.util.Collections;

public class AddressBook
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        // Create a collection to hold Person objects
        ArrayList<Person> addressBook = new ArrayList<Person>();

        // Create people, add them to the collection
        Person person1 = new Person("Chris", "Prabhu", 34);
        Person person2 = new Person("Mary", "Ford", 55);
        Person person3 = new Person("Sarah", "Silverman", 39);
        Person person4 = new Person("Julie", "Yankovic", 22);
        addressBook.add(person1);
        addressBook.add(person2);
        addressBook.add(person3);
        addressBook.add(person4);

        // Display the unsorted contents of the list
        System.out.println("Unsorted");
        for (Person onePerson : addressBook) {
            System.out.println(onePerson);
        }

        // Sort, then display sorted contents of the list
        System.out.println("\nSorted");
        Collections.sort(addressBook);
        for (Person onePerson : addressBook) {
            System.out.println(onePerson);
        }
    }
}