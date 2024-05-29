
package calculation.may6;

import Calculate.Calculator;
import java.util.Scanner;


public class CalculationMay6 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter number 1; ");
        int number1 = scanner.nextInt();
        System.out.println("enter operation (+-*/): ");
        String operation = scanner.next().concat("");
        System.out.println("enter number 2: ");
        int number2 = scanner.nextInt();
        
        Calculator c = new Calculator();
        
        c.number1 =number1;
        c.number2 = number2;
        c.operation = operation;
        
        int result = c.doCalculate();
        System.out.println(result);
    }
    
}
