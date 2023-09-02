
/**
 * Write a description of class SumNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumNumbers {
    
 public static void main(String[] args) {
     System.out.println("Sum through 3 = " + sumNums(3));
     System.out.println("Sum of 2 through 5 = " + sumNums(2, 5));
     System.out.println("Sum of 2 through 5 = " + sumNums(2, 5, 5));
    }
 
 public static int sumNums(int highestNum) {
    int sum = 0; 
    for (int num = 1; num <= highestNum; num++) {
        sum = sum + num;     
    }
        
    return sum; 
     }
     
public static int sumNums(int lowestNum, int highestNum) {
    int sum = 0; 
    for (int num = lowestNum; num <= highestNum; num++) {
        sum = sum + num;     
    }
        
    return sum; 
     }

public static int sumNums(double lowestNum, double highestNum, double increment) {
    int sum = 0; 
    for (double num = lowestNum; num <= highestNum; num += increment) {
        sum += num;     
    }
        
    return sum; 
     }     
    }
