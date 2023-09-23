import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract public class Person implements ISavable
{
    // instance variables - replace the example below with your own
    private String id;
    private String name;
    private String email;

    public Person(String name, String email)
    {
        this.id = "";
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public boolean validId(String id) {
        return true;
    }; 
    // {
    // boolean validId = true;
    // if (id.length() != 9) {
    // validId = false;
    // }
    // else {
    // for (int letterPos = 0; letterPos < id.length(); letterPos++) {
    // if (id.charAt(letterPos) < '0' || id.charAt(letterPos) > '9') {
    // validId = false;
    // }
    // }
    // }

    // return validId;

    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!validId(id)) {
            throw new IllegalArgumentException("Invalid ID; check ID specifications");
        }
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "you found the Person with id: " + this.id + "\n";
    }

    // ISavable Required Methods
    public boolean readFile(File file) throws FileNotFoundException {
        Scanner inFileScan = new Scanner(file);
        setId(inFileScan.nextLine());
        setName(inFileScan.nextLine());
        setEmail(inFileScan.nextLine());
        return true;
    }
    
    public boolean writeFile(File file) throws FileNotFoundException {
        // Write the basic person stuff first
 
        return true;
    }
}
