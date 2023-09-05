public class Main
{
    public static void main(String[] args) {
        IntMathReturn result;
        result = intMath(11,2);
        System.out.println("Add = " + result.add);
        System.out.println("Add = " + result.subtract);
        System.out.println("Add = " + result.multiply);
        System.out.println("Add = " + result.divide);
        
    }

    private static IntMathReturn intMath(int firstInt, int secondInt) {
        IntMathReturn mathRet = new IntMathReturn();
        mathRet.multiply = firstInt * secondInt;
        mathRet.divide = firstInt / secondInt;
        mathRet.add = firstInt + secondInt;
        mathRet.subtract = firstInt - secondInt;
        return mathRet;
    }
    
    private static int intMult(int firstInt, int secondInt) {
        return 0;
    }
}
