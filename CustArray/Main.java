import java.io.*;
import java.util.Scanner;
/**
 * Main program to drive Customer Array demo
 *
 * @author  Chris Prabhu
 * @version  2023-09-08
 */
public class Main
{
    
    /**
     * Main program for Customer Array Example
     *
     * @param  args  command line parameters
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Read data from the file
        File inFile = new File("customers.txt");
        Scanner inScan = new Scanner(inFile);
        
        // Read count and create array
        int custCount = inScan.nextInt();
        Customer custArray[] = new Customer[custCount];

        // Create the objects and store them 
        for (int cust = 0; cust < custCount; cust++) {
            double balance = inScan.nextDouble();
            int age = inScan.nextInt();
            String name = inScan.next() + inScan.nextLine();
            custArray[cust] = new Customer(name, age, balance);
        }

        // Prove we have access to the objects
        System.out.println("Customers: ");
        for (int cust = 0; cust < custCount; cust++) {
            System.out.println(custArray[cust] + "\n");
        }
       
        // Close stuff down 
        inScan.close();
    }


    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

}
