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

                if (choice == 1) {

                    result = fToC(choice);

                }

                else if (choice == 2) {

                    result = kToC(choice);

                }

                System.out.printf("Result is %8.2f\n", result);
            }
        }
        System.out.println("Goodbye");
    }
}

/**
 * Converts Fahrenheit to Celsius
 *
 * @param degF degrees Fahreneheit
 * @return degrees Celsius
 */
public static double fToC(double degF) {

return (degF - 32.0) * 5.0 / 9.0;
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
return (degK + 273.15);
}
}
