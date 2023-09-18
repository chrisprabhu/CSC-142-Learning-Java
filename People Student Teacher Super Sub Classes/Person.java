public class Person
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
    }
    
    public String getId() {
        return id;
    }
    
    public String toString() {
        return "my id is: " + this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
}
