public class Staff extends Person
{
    public Staff(String name, String email) {
        super(name,email);
    }
    
    public boolean validId(String id) {
        return true;
    }
    
}
