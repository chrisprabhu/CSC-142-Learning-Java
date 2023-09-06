import java.util.Scanner;

/**
 * Write a description of class Temps here.
 *
 * @author Chris Prabhu
 * @version 2023-08-31
 */
public class Temps {
    public static void main(String[] args) {
        Scanner consIn = new Scanner(System.in);
        int choice;
        double inputTemp, result =0.0;

        do {
            // Display the menu
            System.out.println("Enter a number (1-2) for the program you want to run");
            System.out.println("1. Fahrenheight to Celcius");
            System.out.println("2. Kelvin to Celsius");
            System.out.println("0. EXIT\n");

            // Get user choice    
            while (!consIn.hasNextInt()) {
                consIn.next();
                System.out.println("Enter a number (1-2) for the program you want to run");
            }
            choice = consIn.nextInt();
            System.out.println("You chose " + choice);

            // Act only on valid choices
            if (choice >= 1 && choice <= 2) {
                System.out.println("Enter the input temperature: ");
                inputTemp = consIn.nextDouble();

                if (choice == 1) { result = fToC(choice); }
                else if (choice == 2) { result = kToC(choice); }

                System.out.printf("Result is %8.2f\n", result);
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }

    /**
     * Converts Fahrenheit to Celsius
     *
     * @param degF degrees Fahrenheit
     * @return degrees Celsius
     */
    public static double fToC(double degF) {
        return 5 * (degF - 32.0) / 9.0;
    }

    /**
     * Converts Kelvin to Celsius
     *
     * @param degK degrees Kelvin
     * @return degrees Celsius
     */
    public static double kToC(double degK) {
        // put your code here
        if (degK < 0) {
            throw new IllegalArgumentException("Kevlin degrees must be non-negative");
        }
        return (degK - 273.15);
    }

    /**
     * Test conversion functions
     */
    public static void testConversions() {
        double input, expected, result;
        System.out.println("\n\nConversion tests starting; any failures will be noted here:");

        // test for fToC
        input = 572.0; expected = 300.0; result = Math.round(fToC(input) * 100.0) / 100.0;
        if (result != expected) System.out.println("fToC failed converting " + input + "; expected " + expected + ", but got " + result);

        // test for kToC
        input = 40.0; expected = -233.15; result = Math.round(kToC(input) * 100) / 100.0;
        if (result != expected) System.out.println("fToC failed converting " + input + "; expected " + expected + ", but got " + result);

        // // test the kToC precondition
        // try {
            // input = 0.5; expected = 0.0; result = Math.round(kToP(input) * 100.0) / 100.0;
            // System.out.println("kToF precondition failed; in put " + input + "did not through an exception");
        // }
        // catch (IllegalArgumentException) {
            // // expected behavior!
        // }
        System.out.println("Conversion tests ending");
    }

    
}
