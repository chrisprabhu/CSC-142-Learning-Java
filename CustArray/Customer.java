
/**
 * Write a description of class Customer here.
 *
 * @author Chris Prabhu
 * @version 2023-09-10
 */
public class Customer
{
    // instance variables - replace the example below with your own
    String name;
    int age;
    double balance;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, int age, double balance)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    /**
     * Return Customer Name
     *
     * @return    the name of the customer
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }

    /**
     * Return Customer Age
     *
     * @return    the name of the Age
     */
    public int getAge()
    {
        // put your code here
        return this.age;
    }

    /**
     * Return Customer Balance
     *
     * @return    the name of the Balance
     */
    public double getBalance()
    {
        // put your code here
        return this.balance;
    }

    /**
     * Return Customer information in string form. 
     *
     * @return    All the data of the customer
     */
    public String toString()
    {
        // put your code here
        String custInfo = "Name: " + this.name + " Age: " + this.age + " Balance: " + this.balance; 
        return custInfo;
    }
}
